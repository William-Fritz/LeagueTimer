package com.example.prototype1

import android.content.IntentSender
import android.graphics.Color
import android.graphics.PorterDuff
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.DisplayMetrics
import android.util.Log
import android.view.Gravity
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    //create variables for back confirmation
    private var backPressedTime: Long = 0
    private var resetPressedTime: Long = 0
    private var backToast:Toast? = null
    private var resetToast:Toast? = null

    // layout clickables
    private val layoutClickables: HashMap<String, Int> = hashMapOf(
        "top right" to R.id.right_top_layout,
        "top left" to R.id.left_top_layout,
        "jungle right" to R.id.right_jungle_layout,
        "jungle left" to R.id.left_jungle_layout,
        "mid right" to R.id.right_mid_layout,
        "mid left" to R.id.left_mid_layout,
        "bottom right" to R.id.right_bottom_layout,
        "bottom left" to R.id.left_bottom_layout,
        "support right" to R.id.right_support_layout,
        "support left" to R.id.left_support_layout
    )

    // button click state
    private var isButtonClicked: HashMap<String, Boolean> = hashMapOf(
        "top right" to false,
        "top left" to false,
        "jungle right" to false,
        "jungle left" to false,
        "mid right" to false,
        "mid left" to false,
        "bottom right" to false,
        "bottom left" to false,
        "support right" to false,
        "support left" to false
    )

    // text IDs
    private val textIDs: HashMap<String, Int> = hashMapOf(
        "top right" to R.id.right_top_lane_status,
        "top left" to R.id.left_top_lane_status,
        "jungle right" to R.id.right_jungle_status,
        "jungle left" to R.id.left_jungle_status,
        "mid right" to R.id.right_mid_lane_status,
        "mid left" to R.id.left_mid_lane_status,
        "bottom right" to R.id.right_bottom_lane_status,
        "bottom left" to R.id.left_bottom_lane_status,
        "support right" to R.id.right_support_status,
        "support left" to R.id.left_support_status
    )

    // image button IDs
    private val imageButtonIDs: HashMap<String, Int> = hashMapOf(
        "top right" to R.id.right_top_lane_button,
        "top left" to R.id.left_top_lane_button,
        "jungle right" to R.id.right_jungle_button,
        "jungle left" to R.id.left_jungle_button,
        "mid right" to R.id.right_mid_lane_button,
        "mid left" to R.id.left_mid_lane_button,
        "bottom right" to R.id.right_bottom_lane_button,
        "bottom left" to R.id.left_bottom_lane_button,
        "support right" to R.id.right_support_button,
        "support left" to R.id.left_support_button
    )

    // button type
    private var buttonTypes: HashMap<String, String> = hashMapOf(
        "top right" to "flash",
        "top left" to "teleport",
        "jungle right" to "smite",
        "jungle left" to "flash",
        "mid right" to "ignite",
        "mid left" to "flash",
        "bottom right" to "heal",
        "bottom left" to "flash",
        "support right" to "exhaust",
        "support left" to "flash"
    )

    // button cooldown
    private val buttonCooldowns: HashMap<String, Long> = hashMapOf(
        "flash" to 300L,
        "heal" to 240L,
        "ghost" to 180L,
        "barrier" to 180L,
        "exhaust" to 210L,
        "teleport" to 360L,
        "smite" to 90L,
        "cleanse" to 210L,
        "ignite" to 180L
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resetButton = findViewById<TextView>(R.id.reset_text)

        layoutClickables.forEach { (name, id) ->
            val clickable = findViewById<LinearLayout>(id)
            clickable.setOnClickListener {
                startTimer(name)
            }
        }
        resetButton.setOnClickListener {
            if(resetPressedTime.plus(1500) > System.currentTimeMillis()){
               resetToast?.cancel()
               recreate()
               return@setOnClickListener
            }else{
               resetToast = Toast.makeText(baseContext, "Press again to reset", Toast.LENGTH_SHORT)
               resetToast?.setGravity(Gravity.BOTTOM, 0, getToastHeight())
               resetToast?.show()
            }
            resetPressedTime = System.currentTimeMillis()
        }

    }

    private fun startTimer(button : String) {
        if (!isButtonClicked[button]!!){
            createTimerAndUpdateButtonViews(button)
        }
    }

    fun createTimerAndUpdateButtonViews(button : String) {
        object : CountDownTimer(buttonCooldowns[buttonTypes[button]]!! * 1000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                updateButtonText(button, millisUntilFinished)
            }

            override fun onFinish() {
                resetViews(button)
            }
        }.start()
        disableButtonAndChangeButtonClickState(button)
    }

    fun updateButtonText(button : String, millisUntilFinished : Long){
        val displayTime = millisToMinutesWithSeconds(millisUntilFinished)
        val buttonText = findViewById<TextView>(textIDs[button]!!)
        buttonText.text = displayTime
    }

    fun millisToMinutesWithSeconds(millisUntilFinished: Long) : String {
        val secondsUntilFinished = millisUntilFinished / 1000
        val displayMinutes = secondsUntilFinished / 60
        var displaySeconds = (secondsUntilFinished % 60).toString()
        if (displaySeconds.length == 1) {
            displaySeconds = "0" + displaySeconds
        }
        return "$displayMinutes:$displaySeconds"
    }

    fun resetViews(button : String) {
        val text = findViewById<TextView>(textIDs[button]!!)
        val imageButton = findViewById<ImageButton>(imageButtonIDs[button]!!)

        text.text = "Ready"
        imageButton.colorFilter = null
        isButtonClicked[button] = false
    }

    fun disableButtonAndChangeButtonClickState(button : String) {
        val imageButton = findViewById<ImageButton>(imageButtonIDs[button]!!)

        imageButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
        isButtonClicked[button] = true
    }

    fun getToastHeight(): Int {
        var display = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(display)
        var toastHeight = 1.0 * 0.69 * menu_layout.height * display.heightPixels/background_layout.height
        return toastHeight.toInt()
    }


    override fun onBackPressed() {
        if ((backPressedTime.plus(1500)) > System.currentTimeMillis()) {
            backToast?.cancel()
            super.onBackPressed()
            return
        }else{
            backToast = Toast.makeText(baseContext, "Press back again to exit", Toast.LENGTH_SHORT)
            backToast?.setGravity(Gravity.BOTTOM, 0, getToastHeight())
            backToast?.show()
        }
        backPressedTime = System.currentTimeMillis()
    }
}




