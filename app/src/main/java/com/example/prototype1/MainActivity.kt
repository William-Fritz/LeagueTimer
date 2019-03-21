package com.example.prototype1

import android.graphics.Color
import android.graphics.PorterDuff
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //create variables for button check

        var button_check_left_top = true
        var button_check_left_mid = true
        var button_check_left_jungle = true
        var button_check_left_bottom = true
        var button_check_left_support = true
        var button_check_right_top = true
        var button_check_right_mid = true
        var button_check_right_jungle = true
        var button_check_right_bottom = true
        var button_check_right_support = true

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
        val left_mid_lane_status = findViewById<TextView>(R.id.left_mid_lane_status )
        val right_bottom_lane_button = findViewById<ImageButton>(R.id.right_bottom_lane_button)
        val right_bottom_lane_status = findViewById<TextView>(R.id.right_bottom_lane_status )
        val left_bottom_lane_button= findViewById<ImageButton>(R.id.left_bottom_lane_button)
        val left_bottom_lane_status  = findViewById<TextView>(R.id.left_bottom_lane_status)
        val right_support_button = findViewById<ImageButton>(R.id.right_support_button)
        val right_support_status = findViewById<TextView>(R.id.right_support_status)
        val left_support_button= findViewById<ImageButton>(R.id.left_support_button)
        val left_support_status  = findViewById<TextView>(R.id.left_support_status  )

        //button listener
        right_top_lane_button.setOnClickListener {
            button_check_right_top = toggle_timer(right_top_lane_status, right_top_lane_button, button_check_right_top)
        }
        right_top_lane_status.setOnClickListener{
            button_check_right_top = toggle_timer(right_top_lane_status, right_top_lane_button, button_check_right_top)
        }
        left_top_lane_button.setOnClickListener {
            button_check_left_top = toggle_timer(left_top_lane_status, left_top_lane_button, button_check_left_top)
        }
        left_top_lane_status.setOnClickListener{
            button_check_left_top = toggle_timer(left_top_lane_status, left_top_lane_button, button_check_left_top)
        }
        right_jungle_button.setOnClickListener {
            button_check_right_jungle = toggle_timer(right_jungle_status, right_jungle_button, button_check_right_jungle)
        }
        right_jungle_status.setOnClickListener{
            button_check_right_jungle = toggle_timer(right_jungle_status, right_jungle_button, button_check_right_jungle)
        }
        left_jungle_button.setOnClickListener {
            button_check_left_jungle = toggle_timer(left_jungle_status, left_jungle_button, button_check_left_jungle)
        }
        left_jungle_status.setOnClickListener {
            button_check_left_jungle = toggle_timer(left_jungle_status, left_jungle_button, button_check_left_jungle)
        }
        right_mid_lane_button.setOnClickListener {
            button_check_right_mid = toggle_timer(right_mid_lane_status, right_mid_lane_button, button_check_right_mid)
        }
        right_mid_lane_status.setOnClickListener {
            button_check_right_mid = toggle_timer(right_mid_lane_status, right_mid_lane_button, button_check_right_mid)
        }
        left_mid_lane_button.setOnClickListener {
            button_check_left_mid = toggle_timer(left_mid_lane_status, left_mid_lane_button, button_check_left_mid)
        }
        left_mid_lane_status.setOnClickListener {
            button_check_left_mid = toggle_timer(left_mid_lane_status, left_mid_lane_button, button_check_left_mid)
        }
        right_bottom_lane_button.setOnClickListener {
            button_check_right_bottom = toggle_timer(right_bottom_lane_status, right_bottom_lane_button, button_check_right_bottom)
        }
        right_bottom_lane_status.setOnClickListener {
            button_check_right_bottom = toggle_timer(right_bottom_lane_status, right_bottom_lane_button, button_check_right_bottom)
        }
        left_bottom_lane_button.setOnClickListener {
            button_check_left_bottom = toggle_timer(left_bottom_lane_status, left_bottom_lane_button, button_check_left_bottom)
        }
        left_bottom_lane_status.setOnClickListener {
            button_check_left_bottom = toggle_timer(left_bottom_lane_status, left_bottom_lane_button, button_check_left_bottom)
        }
        right_support_button.setOnClickListener {
            button_check_right_support = toggle_timer(right_support_status, right_support_button, button_check_right_support)
        }
        right_support_status.setOnClickListener {
            button_check_right_support = toggle_timer(right_support_status, right_support_button, button_check_right_support)
        }
        left_support_button.setOnClickListener {
            button_check_left_support = toggle_timer(left_support_status, left_support_button, button_check_left_support)
        }
        left_support_status.setOnClickListener {
            button_check_left_support = toggle_timer(left_support_status, left_support_button, button_check_left_support)
        }
    }

    //function to change the text and the foreground color of button

    fun toggle_timer(text: TextView, imageButton: ImageButton, button_check: Boolean): Boolean {
        var toggle_active = button_check
        if (toggle_active) {
            text.setText(getString(R.string.cooldown))
            imageButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
        }
        else {
            text.setText(getString(R.string.ready))
            imageButton.setColorFilter(null)
        }
        toggle_active = !toggle_active

        return toggle_active
    }
}




