package com.example.prototype1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private var button_check = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val top_lane_button2 = findViewById<ImageButton>(R.id.top_lane_button2)
        top_lane_button2.setOnClickListener {
            if (button_check == true) {
                top_lane_status2.setText(getString(R.string.cooldown))
                button_check = false
            } else {
                top_lane_status2.setText(getString(R.string.ready))
                button_check = true
            }

        }
    }
}

