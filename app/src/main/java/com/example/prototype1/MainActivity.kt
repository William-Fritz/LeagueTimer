package com.example.prototype1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val top_lane_button2 = findViewById<ImageButton>(R.id.top_lane_button2)
        val top_lane_status2 = findViewById<TextView>(R.id.top_lane_status2)
        top_lane_button2.setOnClickListener{top_lane_status2.setText(getString(R.string.cooldown))}
        top_lane_status2.setOnClickListener{top_lane_status2.setText(getString(R.string.cooldown))}

    }
}
