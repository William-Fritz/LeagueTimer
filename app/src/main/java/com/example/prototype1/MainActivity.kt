package com.example.prototype1

import android.graphics.Color
import android.graphics.PorterDuff
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageButton
import android.widget.TextView
import android.widget.EditText
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {

    private lateinit var timer: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //create variables for button check

        var left_top_button_is_clicked = true
        var left_mid_button_is_clicked = true
        var left_jungle_button_is_clicked = true
        var left_bottom_button_is_clicked = true
        var left_support_button_is_clicked = true
        var right_top_button_is_clicked = true
        var right_mid_button_is_clicked = true
        var right_jungle_button_is_clicked = true
        var right_bottom_button_is_clicked = true
        var right_support_button_is_clicked = true

        //create variables for all imagebutton and textview

        val right_top_lane_button = findViewById<ImageButton>(R.id.right_top_lane_button)
        val right_top_lane_status = findViewById<TextView>(R.id.right_top_lane_status)
        val left_top_lane_button = findViewById<ImageButton>(R.id.left_top_lane_button)
        val left_top_lane_status = findViewById<TextView>(R.id.left_top_lane_status)
        val right_jungle_button = findViewById<ImageButton>(R.id.right_jungle_button)
        val right_jungle_status = findViewById<TextView>(R.id.right_jungle_status)
        val left_jungle_button = findViewById<ImageButton>(R.id.left_jungle_button)
        val left_jungle_status = findViewById<TextView>(R.id.left_jungle_status)
        val right_mid_lane_button = findViewById<ImageButton>(R.id.right_mid_lane_button)
        val right_mid_lane_status = findViewById<TextView>(R.id.right_mid_lane_status)
        val left_mid_lane_button= findViewById<ImageButton>(R.id.left_mid_lane_button)
        val left_mid_lane_status = findViewById<TextView>(R.id.left_mid_lane_status)
        val right_bottom_lane_button = findViewById<ImageButton>(R.id.right_bottom_lane_button)
        val right_bottom_lane_status = findViewById<TextView>(R.id.right_bottom_lane_status )
        val left_bottom_lane_button= findViewById<ImageButton>(R.id.left_bottom_lane_button)
        val left_bottom_lane_status  = findViewById<TextView>(R.id.left_bottom_lane_status)
        val right_support_button = findViewById<ImageButton>(R.id.right_support_button)
        val right_support_status = findViewById<TextView>(R.id.right_support_status)
        val left_support_button= findViewById<ImageButton>(R.id.left_support_button)
        val left_support_status  = findViewById<TextView>(R.id.left_support_status)
        val reset_button = findViewById<TextView>(R.id.reset_text)

        // timer
        var leftTopTimer = object: CountDownTimer(5000,1000){
            override fun onTick(millisUntilFinished: Long) {
                left_top_lane_status.setText("${millisUntilFinished/1000 + 1}")
            }
            override fun onFinish() {
                left_top_lane_status.setText(getString(R.string.ready))
                left_top_lane_button.setColorFilter(null)
                left_top_button_is_clicked = !left_top_button_is_clicked
            }
        }

        //button listener
        right_top_lane_button.setOnClickListener {
            right_top_button_is_clicked = toggle_timer(right_top_lane_status, right_top_lane_button, right_top_button_is_clicked)
        }
        right_top_lane_status.setOnClickListener{
            right_top_button_is_clicked = toggle_timer(right_top_lane_status, right_top_lane_button, right_top_button_is_clicked)
        }
        left_top_lane_button.setOnClickListener {
            if (left_top_button_is_clicked) {
                leftTopTimer.start()
                left_top_lane_button.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                left_top_button_is_clicked = !left_top_button_is_clicked
            }
        }
        left_top_lane_status.setOnClickListener{
            left_top_button_is_clicked = toggle_timer(left_top_lane_status, left_top_lane_button, left_top_button_is_clicked)
        }
        right_jungle_button.setOnClickListener {
            right_jungle_button_is_clicked = toggle_timer(right_jungle_status, right_jungle_button, right_jungle_button_is_clicked)
        }
        right_jungle_status.setOnClickListener{
            right_jungle_button_is_clicked = toggle_timer(right_jungle_status, right_jungle_button, right_jungle_button_is_clicked)
        }
        left_jungle_button.setOnClickListener {
            left_jungle_button_is_clicked = toggle_timer(left_jungle_status, left_jungle_button, left_jungle_button_is_clicked)
        }
        left_jungle_status.setOnClickListener {
            left_jungle_button_is_clicked = toggle_timer(left_jungle_status, left_jungle_button, left_jungle_button_is_clicked)
        }
        right_mid_lane_button.setOnClickListener {
            right_mid_button_is_clicked = toggle_timer(right_mid_lane_status, right_mid_lane_button, right_mid_button_is_clicked)
        }
        right_mid_lane_status.setOnClickListener {
            right_mid_button_is_clicked = toggle_timer(right_mid_lane_status, right_mid_lane_button, right_mid_button_is_clicked)
        }
        left_mid_lane_button.setOnClickListener {
            left_mid_button_is_clicked = toggle_timer(left_mid_lane_status, left_mid_lane_button, left_mid_button_is_clicked)
        }
        left_mid_lane_status.setOnClickListener {
            left_mid_button_is_clicked = toggle_timer(left_mid_lane_status, left_mid_lane_button, left_mid_button_is_clicked)
        }
        right_bottom_lane_button.setOnClickListener {
            right_bottom_button_is_clicked = toggle_timer(right_bottom_lane_status, right_bottom_lane_button, right_bottom_button_is_clicked)
        }
        right_bottom_lane_status.setOnClickListener {
            right_bottom_button_is_clicked = toggle_timer(right_bottom_lane_status, right_bottom_lane_button, right_bottom_button_is_clicked)
        }
        left_bottom_lane_button.setOnClickListener {
            left_bottom_button_is_clicked = toggle_timer(left_bottom_lane_status, left_bottom_lane_button, left_bottom_button_is_clicked)
        }
        left_bottom_lane_status.setOnClickListener {
            left_bottom_button_is_clicked = toggle_timer(left_bottom_lane_status, left_bottom_lane_button, left_bottom_button_is_clicked)
        }
        right_support_button.setOnClickListener {
            right_support_button_is_clicked = toggle_timer(right_support_status, right_support_button, right_support_button_is_clicked)
        }
        right_support_status.setOnClickListener {
            right_support_button_is_clicked = toggle_timer(right_support_status, right_support_button, right_support_button_is_clicked)
        }
        left_support_button.setOnClickListener {
            left_support_button_is_clicked = toggle_timer(left_support_status, left_support_button, left_support_button_is_clicked)
        }
        left_support_status.setOnClickListener {
            left_support_button_is_clicked = toggle_timer(left_support_status, left_support_button, left_support_button_is_clicked)
        }
        reset_button.setOnClickListener {
            recreate()
        }
    }

    //function to change the text and the foreground color of button

    fun toggle_timer(text: TextView, imageButton: ImageButton, button_is_clicked: Boolean): Boolean {
        var toggle_active = button_is_clicked
        if (toggle_active) {
            startTimer(text, imageButton, button_is_clicked)
        }
        return toggle_active
        //deleted the else argument since we no longer need it, kept the boolean toogle_active to make the onLongPress function next
    }
    //made the proper timer function, so i can use it as callbacks later with onResume and onPause
    fun startTimer(text: TextView, imageButton: ImageButton, toggle: Boolean){
        var mToggle = toggle
        timer = object: CountDownTimer(5000,1000){
            override fun onTick(millisUntilFinished: Long) {
                text.setText(getString(R.string.cooldown))
                imageButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
            }
            override fun onFinish() {
                text.setText(getString(R.string.ready))
                imageButton.setColorFilter(null)
                mToggle = !mToggle
            }
        }.start()
    }
}




