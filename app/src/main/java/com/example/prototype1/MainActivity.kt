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
    private var button_check = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //create buttons for top lane

        val right_top_lane_button = findViewById<ImageButton>(R.id.right_top_lane_button)
        right_top_lane_button.setOnClickListener {
            button_check = toggle_timer(right_top_lane_status, right_top_lane_button, button_check)
        }
        val right_top_lane_status = findViewById<TextView>(R.id.right_top_lane_status)
        right_top_lane_status.setOnClickListener {
            button_check = toggle_timer(right_top_lane_status, right_top_lane_button, button_check)
        }
        val left_top_lane_button = findViewById<ImageButton>(R.id.left_top_lane_button)
        left_top_lane_button.setOnClickListener {
            button_check = toggle_timer(left_top_lane_status, left_top_lane_button, button_check)
        }
        val left_top_lane_status = findViewById<TextView>(R.id.left_top_lane_status)
        left_top_lane_status.setOnClickListener {
            button_check = toggle_timer(left_top_lane_status, left_top_lane_button, button_check)
        }

        // created the button for jungle

        val right_jungle_button = findViewById<ImageButton>(R.id.right_jungle_button)
        right_jungle_button.setOnClickListener {
            button_check = toggle_timer(right_jungle_status, right_jungle_button, button_check)
        }
        val right_jungle_status = findViewById<TextView>(R.id.right_jungle_status)
        right_jungle_status.setOnClickListener {
            button_check = toggle_timer(right_jungle_status, right_jungle_button, button_check)
        }
        val left_jungle_button = findViewById<ImageButton>(R.id.left_jungle_button)
        left_jungle_button.setOnClickListener {
            button_check = toggle_timer(left_jungle_status, left_jungle_button, button_check)
        }
        val left_jungle_status = findViewById<TextView>(R.id.left_jungle_status)
        left_jungle_status.setOnClickListener {
            button_check = toggle_timer(left_jungle_status, left_jungle_button, button_check)
        }

        //create all buttons for mid

        val right_mid_lane_button = findViewById<ImageButton>(R.id.right_mid_lane_button)
        right_mid_lane_button.setOnClickListener {
            button_check = toggle_timer(right_mid_lane_status, right_mid_lane_button, button_check)
        }
        val right_mid_lane_status = findViewById<TextView>(R.id.right_mid_lane_status)
        right_mid_lane_status.setOnClickListener {
            button_check = toggle_timer(right_mid_lane_status, right_mid_lane_button, button_check)
        }
        val left_mid_lane_button= findViewById<ImageButton>(R.id.left_mid_lane_button)
        left_mid_lane_button.setOnClickListener {
            button_check = toggle_timer(left_mid_lane_status, left_mid_lane_button, button_check)
        }
        val left_mid_lane_status = findViewById<TextView>(R.id.left_mid_lane_status )
        left_mid_lane_status .setOnClickListener {
            button_check = toggle_timer(left_mid_lane_status, left_mid_lane_button, button_check)
        }

        //create all buttons for bottom lane

        val right_bottom_lane_button = findViewById<ImageButton>(R.id.right_bottom_lane_button)
        right_bottom_lane_button.setOnClickListener {
            button_check = toggle_timer(right_bottom_lane_status, right_bottom_lane_button, button_check)
        }
        val right_bottom_lane_status = findViewById<TextView>(R.id.right_bottom_lane_status )
        right_bottom_lane_status .setOnClickListener {
            button_check = toggle_timer(right_bottom_lane_status, right_bottom_lane_button, button_check)
        }
        val left_bottom_lane_button= findViewById<ImageButton>(R.id.left_bottom_lane_button)
        left_bottom_lane_button.setOnClickListener {
            button_check = toggle_timer(left_bottom_lane_status, left_bottom_lane_button, button_check)
        }
        val left_bottom_lane_status  = findViewById<TextView>(R.id.left_bottom_lane_status)
        left_bottom_lane_status .setOnClickListener {
            button_check = toggle_timer(left_bottom_lane_status, left_bottom_lane_button, button_check)
        }

        //create all buttons for support

        val right_support_button = findViewById<ImageButton>(R.id.right_support_button)
        right_support_button.setOnClickListener {
            button_check = toggle_timer(right_support_status, right_support_button, button_check)
        }
        val right_support_status = findViewById<TextView>(R.id.right_support_status)
        right_support_status .setOnClickListener {
            button_check = toggle_timer(right_support_status, right_support_button, button_check)
        }
        val left_support_button= findViewById<ImageButton>(R.id.left_support_button)
        left_support_button.setOnClickListener {
            button_check = toggle_timer(left_support_status, left_support_button, button_check)
        }
        val left_support_status  = findViewById<TextView>(R.id.left_support_status  )
        left_support_status   .setOnClickListener {
            button_check = toggle_timer(left_support_status, left_support_button, button_check)
        }


    }

    //function to change the text and the foreground color of button

    fun toggle_timer(text: TextView, imageButton: ImageButton, button_check: Boolean): Boolean {
        var toggle_active = button_check
        if (toggle_active) {
            text.setText(getString(R.string.cooldown))
            imageButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
        } else {
            text.setText(getString(R.string.ready))
            imageButton.setColorFilter(null)
        }
        toggle_active = !toggle_active

        return toggle_active
    }
}




