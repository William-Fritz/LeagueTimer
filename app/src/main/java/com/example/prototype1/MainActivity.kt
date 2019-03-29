package com.example.prototype1

import android.graphics.Color
import android.graphics.PorterDuff
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.Gravity
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast



class MainActivity : AppCompatActivity() {


    //create variables for back confirmation
    private var backPressedTime: Long = 0
    private var resetPressedTime: Long = 0
    private var backToast:Toast? = null
    private var resetToast:Toast? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //create variables for button check

        var lefTopButtonIsClicked = true
        var leftMidButtonIsClicked = true
        var leftJungleButtonIsClicked = true
        var leftBottomButtonIsClicked = true
        var leftSupportButtonIsClicked = true
        var rightTopButtonIsClicked = true
        var rightMidButtonIsClicked = true
        var rightJungleButtonIsClicked = true
        var rightBottomButtonIsClicked = true
        var rightSupportButtonIsClicked = true

        // variables for button choice
        val buttonCooldowns: HashMap<String, Long> = hashMapOf(
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

        // button type
        var leftTopButtonType = "teleport"
        var rightTopButtonType = "flash"
        var leftJungleButtonType ="smite"
        var rightJungleButtonType ="flash"
        var leftMidButtonType = "flash"
        var rightMidButtonType = "ignite"
        var leftBottomButtonType = "flash"
        var rightBottomButtonType = "heal"
        var leftSupportButtonType = "flash"
        var rightSupportButtonType = "exhaust"



        //create variables for all imagebutton and textview

        val rightTopAreaClickable = findViewById<LinearLayout>(R.id.right_top_layout)
        val leftTopAreaClickable = findViewById<LinearLayout>(R.id.left_top_layout)
        val rightJungleAreaClickable = findViewById<LinearLayout>(R.id.right_jungle_layout)
        val leftJungleAreaClickable = findViewById<LinearLayout>(R.id.left_jungle_layout)
        val rightMiddleAreaClickable = findViewById<LinearLayout>(R.id.right_mid_layout)
        val leftMiddleAreaClickable = findViewById<LinearLayout>(R.id.left_mid_layout)
        val rightBottomAreaClickable = findViewById<LinearLayout>(R.id.right_bottom_layout)
        val leftBottomAreaClickable = findViewById<LinearLayout>(R.id.left_bottom_layout)
        val rightSupportAreaClickable = findViewById<LinearLayout>(R.id.right_support_layout)
        val leftSupportAreaClickable = findViewById<LinearLayout>(R.id.left_support_layout)
        val rightTopLaneButton = findViewById<ImageButton>(R.id.right_top_lane_button)
        val rightTopLaneStatus = findViewById<TextView>(R.id.right_top_lane_status)
        val leftTopLaneButton = findViewById<ImageButton>(R.id.left_top_lane_button)
        val leftTopLaneStatus = findViewById<TextView>(R.id.left_top_lane_status)
        val rightJungleButton = findViewById<ImageButton>(R.id.right_jungle_button)
        val rightJungleStatus = findViewById<TextView>(R.id.right_jungle_status)
        val leftJungleButton = findViewById<ImageButton>(R.id.left_jungle_button)
        val leftJungleStatus = findViewById<TextView>(R.id.left_jungle_status)
        val rightMidLaneButton = findViewById<ImageButton>(R.id.right_mid_lane_button)
        val rightMidLaneStatus = findViewById<TextView>(R.id.right_mid_lane_status)
        val leftMidLaneButton= findViewById<ImageButton>(R.id.left_mid_lane_button)
        val leftMidLaneStatus = findViewById<TextView>(R.id.left_mid_lane_status)
        val rightBottomLaneButton = findViewById<ImageButton>(R.id.right_bottom_lane_button)
        val rightBottomLaneStatus = findViewById<TextView>(R.id.right_bottom_lane_status )
        val leftBottomLaneButton= findViewById<ImageButton>(R.id.left_bottom_lane_button)
        val leftBottomLaneStatus  = findViewById<TextView>(R.id.left_bottom_lane_status)
        val rightSupportButton = findViewById<ImageButton>(R.id.right_support_button)
        val rightSupportStatus = findViewById<TextView>(R.id.right_support_status)
        val leftSupportButton= findViewById<ImageButton>(R.id.left_support_button)
        val leftSupportStatus  = findViewById<TextView>(R.id.left_support_status)
        val resetButton = findViewById<TextView>(R.id.reset_text)

        //button listener
        rightTopAreaClickable.setOnClickListener {
            if (rightTopButtonIsClicked) {
                object: CountDownTimer(buttonCooldowns[rightTopButtonType]!! * 1000,1000){
                    override fun onTick(millisUntilFinished: Long) {
                        val secondsRemaining = millisUntilFinished / 1000
                        val minutesRemaining = secondsRemaining / 60
                        val timeRemainingInSeconds = secondsRemaining % 60
                        val secondsAsStr = timeRemainingInSeconds.toString()
                        rightTopLaneStatus.text = "$minutesRemaining:${if(secondsAsStr.length == 2)secondsAsStr else "0" +secondsAsStr}"
                    }
                    override fun onFinish() {
                        rightTopLaneStatus.text = (getString(R.string.ready))
                        rightTopLaneButton.colorFilter = null
                        rightTopButtonIsClicked = !rightTopButtonIsClicked
                    }
                }.start()
                rightTopLaneButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                rightTopButtonIsClicked = !rightTopButtonIsClicked
            }
        }
        leftTopAreaClickable.setOnClickListener {
            if (lefTopButtonIsClicked) {
                object: CountDownTimer(buttonCooldowns[leftTopButtonType]!! * 1000,1000){
                    override fun onTick(millisUntilFinished: Long) {
                        val secondsRemaining = millisUntilFinished / 1000
                        val minutesRemaining = secondsRemaining / 60
                        val timeRemainingInSeconds = secondsRemaining % 60
                        val secondsAsStr = timeRemainingInSeconds.toString()
                        leftTopLaneStatus.text = "$minutesRemaining:${if(secondsAsStr.length == 2)secondsAsStr else "0" +secondsAsStr}"
                    }
                    override fun onFinish() {
                        leftTopLaneStatus.setText(getString(R.string.ready))
                        leftTopLaneButton.setColorFilter(null)
                        lefTopButtonIsClicked = !lefTopButtonIsClicked
                    }
                }.start()
                leftTopLaneButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                lefTopButtonIsClicked = !lefTopButtonIsClicked
            }
        }
        rightJungleAreaClickable.setOnClickListener {
            if (rightJungleButtonIsClicked) {
                object: CountDownTimer(buttonCooldowns[rightJungleButtonType]!! * 1000,1000) {
                    override fun onTick(millisUntilFinished: Long) {
                        val secondsRemaining = millisUntilFinished / 1000
                        val minutesRemaining = secondsRemaining / 60
                        val timeRemainingInSeconds = secondsRemaining % 60
                        val secondsAsStr = timeRemainingInSeconds.toString()
                        rightJungleStatus.text = "$minutesRemaining:${if(secondsAsStr.length == 2)secondsAsStr else "0" +secondsAsStr}"
                    }
                    override fun onFinish() {
                        rightJungleStatus.setText(getString(R.string.ready))
                        rightJungleButton.setColorFilter(null)
                        rightJungleButtonIsClicked = !rightJungleButtonIsClicked
                    }
                }.start()
                rightJungleButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                rightJungleButtonIsClicked = !rightJungleButtonIsClicked
            }
        }
        leftJungleAreaClickable.setOnClickListener {
            if (leftJungleButtonIsClicked) {
                object: CountDownTimer(buttonCooldowns[leftJungleButtonType]!! * 1000,1000){
                    override fun onTick(millisUntilFinished: Long) {
                        val secondsRemaining = millisUntilFinished / 1000
                        val minutesRemaining = secondsRemaining / 60
                        val timeRemainingInSeconds = secondsRemaining % 60
                        val secondsAsStr = timeRemainingInSeconds.toString()
                        leftJungleStatus.text = "$minutesRemaining:${if(secondsAsStr.length == 2)secondsAsStr else "0" +secondsAsStr}"
                    }
                    override fun onFinish() {
                        leftJungleStatus.setText(getString(R.string.ready))
                        leftJungleButton.setColorFilter(null)
                        leftJungleButtonIsClicked = !leftJungleButtonIsClicked
                    }
                }.start()
                leftJungleButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                leftJungleButtonIsClicked = !leftJungleButtonIsClicked
            }
        }
        rightMiddleAreaClickable.setOnClickListener {
            if (rightMidButtonIsClicked) {
                object: CountDownTimer(buttonCooldowns[rightMidButtonType]!! * 1000,1000){
                    override fun onTick(millisUntilFinished: Long) {
                        val secondsRemaining = millisUntilFinished / 1000
                        val minutesRemaining = secondsRemaining / 60
                        val timeRemainingInSeconds = secondsRemaining % 60
                        val secondsAsStr = timeRemainingInSeconds.toString()
                        rightMidLaneStatus.text = "$minutesRemaining:${if(secondsAsStr.length == 2)secondsAsStr else "0" +secondsAsStr}"
                    }
                    override fun onFinish() {
                        rightMidLaneStatus.setText(getString(R.string.ready))
                        rightMidLaneButton.setColorFilter(null)
                        rightMidButtonIsClicked = !rightMidButtonIsClicked
                    }
                }.start()
                rightMidLaneButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                rightMidButtonIsClicked = !rightMidButtonIsClicked
            }
        }
        leftMiddleAreaClickable.setOnClickListener {
            if (leftMidButtonIsClicked) {
                object: CountDownTimer(buttonCooldowns[leftMidButtonType]!! * 1000,1000){
                    override fun onTick(millisUntilFinished: Long) {
                        val secondsRemaining = millisUntilFinished / 1000
                        val minutesRemaining = secondsRemaining / 60
                        val timeRemainingInSeconds = secondsRemaining % 60
                        val secondsAsStr = timeRemainingInSeconds.toString()
                        leftMidLaneStatus.text = "$minutesRemaining:${if(secondsAsStr.length == 2)secondsAsStr else "0" +secondsAsStr}"
                    }
                    override fun onFinish() {
                        leftMidLaneStatus.setText(getString(R.string.ready))
                        leftMidLaneButton.setColorFilter(null)
                        leftMidButtonIsClicked = !leftMidButtonIsClicked
                    }
                }.start()
                leftMidLaneButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                leftMidButtonIsClicked = !leftMidButtonIsClicked
            }
        }
        rightBottomAreaClickable.setOnClickListener {
            if (rightBottomButtonIsClicked) {
                object: CountDownTimer(buttonCooldowns[rightBottomButtonType]!! * 1000,1000){
                    override fun onTick(millisUntilFinished: Long) {
                        val secondsRemaining = millisUntilFinished / 1000
                        val minutesRemaining = secondsRemaining / 60
                        val timeRemainingInSeconds = secondsRemaining % 60
                        val secondsAsStr = timeRemainingInSeconds.toString()
                        rightBottomLaneStatus.text = "$minutesRemaining:${if(secondsAsStr.length == 2)secondsAsStr else "0" +secondsAsStr}"
                    }
                    override fun onFinish() {
                        rightBottomLaneStatus.setText(getString(R.string.ready))
                        rightBottomLaneButton.setColorFilter(null)
                        rightBottomButtonIsClicked = !rightBottomButtonIsClicked
                    }
                }.start()
                rightBottomLaneButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                rightBottomButtonIsClicked = !rightBottomButtonIsClicked
            }
        }
        leftBottomAreaClickable.setOnClickListener {
            if (leftBottomButtonIsClicked) {
                object: CountDownTimer(buttonCooldowns[leftBottomButtonType]!! * 1000,1000){
                    override fun onTick(millisUntilFinished: Long) {
                        val secondsRemaining = millisUntilFinished / 1000
                        val minutesRemaining = secondsRemaining / 60
                        val timeRemainingInSeconds = secondsRemaining % 60
                        val secondsAsStr = timeRemainingInSeconds.toString()
                        leftBottomLaneStatus.text = "$minutesRemaining:${if(secondsAsStr.length == 2)secondsAsStr else "0" +secondsAsStr}"
                    }
                    override fun onFinish() {
                        leftBottomLaneStatus.setText(getString(R.string.ready))
                        leftBottomLaneButton.setColorFilter(null)
                        leftBottomButtonIsClicked = !leftBottomButtonIsClicked
                    }
                }.start()
                leftBottomLaneButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                leftBottomButtonIsClicked = !leftBottomButtonIsClicked
            }
        }
        rightSupportAreaClickable.setOnClickListener {
            if (rightSupportButtonIsClicked) {
                object: CountDownTimer(buttonCooldowns[rightSupportButtonType]!! * 1000,1000){
                    override fun onTick(millisUntilFinished: Long) {
                        val secondsRemaining = millisUntilFinished / 1000
                        val minutesRemaining = secondsRemaining / 60
                        val timeRemainingInSeconds = secondsRemaining % 60
                        val secondsAsStr = timeRemainingInSeconds.toString()
                        rightSupportStatus.text = "$minutesRemaining:${if(secondsAsStr.length == 2)secondsAsStr else "0" +secondsAsStr}"
                    }
                    override fun onFinish() {
                        rightSupportStatus.setText(getString(R.string.ready))
                        rightSupportButton.setColorFilter(null)
                        rightSupportButtonIsClicked = !rightSupportButtonIsClicked
                    }
                }.start()
                rightSupportButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                rightSupportButtonIsClicked = !rightSupportButtonIsClicked
            }
        }
        leftSupportAreaClickable.setOnClickListener {
            if (leftSupportButtonIsClicked) {
                object: CountDownTimer(buttonCooldowns[leftSupportButtonType]!! * 1000,1000){
                    override fun onTick(millisUntilFinished: Long) {
                        val secondsRemaining = millisUntilFinished / 1000
                        val minutesRemaining = secondsRemaining / 60
                        val timeRemainingInSeconds = secondsRemaining % 60
                        val secondsAsStr = timeRemainingInSeconds.toString()
                        leftSupportStatus.text = "$minutesRemaining:${if(secondsAsStr.length == 2)secondsAsStr else "0" +secondsAsStr}"
                    }
                    override fun onFinish() {
                        leftSupportStatus.setText(getString(R.string.ready))
                        leftSupportButton.setColorFilter(null)
                        leftSupportButtonIsClicked = !leftSupportButtonIsClicked
                    }
                }.start()
                leftSupportButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                leftSupportButtonIsClicked = !leftSupportButtonIsClicked
            }
        }
        resetButton.setOnClickListener {
            if(resetPressedTime.plus(1500) > System.currentTimeMillis()){
               resetToast?.cancel()
               recreate()
               return@setOnClickListener
            }else{
               resetToast = Toast.makeText(baseContext, "Press again to reset", Toast.LENGTH_SHORT)
               resetToast?.setGravity(Gravity.BOTTOM, 0 ,130)
               resetToast?.show()
            }
            resetPressedTime = System.currentTimeMillis()
        }

    }
    override fun onBackPressed() {
        if ((backPressedTime.plus(1500)) > System.currentTimeMillis()) {
            backToast?.cancel()
            super.onBackPressed()
            return
        }else{
            backToast = Toast.makeText(baseContext, "Press back again to exit", Toast.LENGTH_SHORT)
            backToast?.show()
        }
        backPressedTime = System.currentTimeMillis()
    }
}




