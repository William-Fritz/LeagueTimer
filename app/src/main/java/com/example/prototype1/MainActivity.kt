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
        var rightTopTimer = object: CountDownTimer(5000,1000){
            override fun onTick(millisUntilFinished: Long) {
                right_top_lane_status.setText("${millisUntilFinished/1000 + 1}")
            }
            override fun onFinish() {
                right_top_lane_status.setText(getString(R.string.ready))
                right_top_lane_button.setColorFilter(null)
                right_top_button_is_clicked = !right_top_button_is_clicked
            }
        }
        var leftJungleTimer = object: CountDownTimer(5000,1000){
            override fun onTick(millisUntilFinished: Long) {
                left_jungle_status.setText("${millisUntilFinished/1000 + 1}")
            }
            override fun onFinish() {
                left_jungle_status.setText(getString(R.string.ready))
                left_jungle_button.setColorFilter(null)
                left_jungle_button_is_clicked = !left_jungle_button_is_clicked
            }
        }
        var rightJungleTimer = object: CountDownTimer(5000,1000){
            override fun onTick(millisUntilFinished: Long) {
                right_jungle_status.setText("${millisUntilFinished/1000 + 1}")
            }
            override fun onFinish() {
                right_jungle_status.setText(getString(R.string.ready))
                right_jungle_button.setColorFilter(null)
                right_jungle_button_is_clicked = !right_jungle_button_is_clicked
            }
        }
        var leftMiddleTimer = object: CountDownTimer(5000,1000){
            override fun onTick(millisUntilFinished: Long) {
                left_mid_lane_status.setText("${millisUntilFinished/1000 + 1}")
            }
            override fun onFinish() {
                left_mid_lane_status.setText(getString(R.string.ready))
                left_mid_lane_button.setColorFilter(null)
                left_mid_button_is_clicked = !left_mid_button_is_clicked
            }
        }
        var rightMiddleTimer = object: CountDownTimer(5000,1000){
            override fun onTick(millisUntilFinished: Long) {
                right_mid_lane_status.setText("${millisUntilFinished/1000 + 1}")
            }
            override fun onFinish() {
                right_mid_lane_status.setText(getString(R.string.ready))
                right_mid_lane_button.setColorFilter(null)
                right_mid_button_is_clicked = !right_mid_button_is_clicked
            }
        }
        var leftBottomTimer = object: CountDownTimer(5000,1000){
            override fun onTick(millisUntilFinished: Long) {
                left_bottom_lane_status.setText("${millisUntilFinished/1000 + 1}")
            }
            override fun onFinish() {
                left_bottom_lane_status.setText(getString(R.string.ready))
                left_bottom_lane_button.setColorFilter(null)
                left_bottom_button_is_clicked = !left_bottom_button_is_clicked
            }
        }
        var rightBottomTimer = object: CountDownTimer(5000,1000){
            override fun onTick(millisUntilFinished: Long) {
                right_bottom_lane_status.setText("${millisUntilFinished/1000 + 1}")
            }
            override fun onFinish() {
                right_bottom_lane_status.setText(getString(R.string.ready))
                right_bottom_lane_button.setColorFilter(null)
                right_bottom_button_is_clicked = !right_bottom_button_is_clicked
            }
        }
        var leftSupportTimer = object: CountDownTimer(5000,1000){
            override fun onTick(millisUntilFinished: Long) {
                left_support_status.setText("${millisUntilFinished/1000 + 1}")
            }
            override fun onFinish() {
                left_support_status.setText(getString(R.string.ready))
                left_support_button.setColorFilter(null)
                left_support_button_is_clicked = !left_support_button_is_clicked
            }
        }
        var rightSupportTimer = object: CountDownTimer(5000,1000){
            override fun onTick(millisUntilFinished: Long) {
                right_support_status.setText("${millisUntilFinished/1000 + 1}")
            }
            override fun onFinish() {
                right_support_status.setText(getString(R.string.ready))
                right_support_button.setColorFilter(null)
                right_support_button_is_clicked = !right_support_button_is_clicked
            }
        }

        //button listener
        right_top_lane_button.setOnClickListener {
            if (right_top_button_is_clicked) {
                rightTopTimer.start()
                right_top_lane_button.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                right_top_button_is_clicked = !right_top_button_is_clicked
            }
        }
        right_top_lane_status.setOnClickListener{
            if (right_top_button_is_clicked) {
                rightTopTimer.start()
                right_top_lane_button.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                right_top_button_is_clicked = !right_top_button_is_clicked
            }
        }
        left_top_lane_button.setOnClickListener {
            if (left_top_button_is_clicked) {
                leftTopTimer.start()
                left_top_lane_button.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                left_top_button_is_clicked = !left_top_button_is_clicked
            }
        }
        left_top_lane_status.setOnClickListener{
            if (left_top_button_is_clicked) {
                leftTopTimer.start()
                left_top_lane_button.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                left_top_button_is_clicked = !left_top_button_is_clicked
            }
        }
        right_jungle_button.setOnClickListener {
            if (right_jungle_button_is_clicked) {
                rightJungleTimer.start()
                right_jungle_button.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                right_jungle_button_is_clicked = !right_jungle_button_is_clicked
            }
        }
        right_jungle_status.setOnClickListener{
            if (right_jungle_button_is_clicked) {
                rightJungleTimer.start()
                right_jungle_button.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                right_jungle_button_is_clicked = !right_jungle_button_is_clicked
            }
        }
        left_jungle_button.setOnClickListener {
            if (left_jungle_button_is_clicked) {
                leftJungleTimer.start()
                left_jungle_button.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                left_jungle_button_is_clicked = !left_jungle_button_is_clicked
            }
        }
        left_jungle_status.setOnClickListener {
            if (left_jungle_button_is_clicked) {
                leftJungleTimer.start()
                left_jungle_button.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                left_jungle_button_is_clicked = !left_jungle_button_is_clicked
            }
        }
        right_mid_lane_button.setOnClickListener {
            if (right_mid_button_is_clicked) {
                rightMiddleTimer.start()
                right_mid_lane_button.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                right_mid_button_is_clicked = !right_mid_button_is_clicked
            }
        }
        right_mid_lane_status.setOnClickListener {
            if (right_mid_button_is_clicked) {
                rightMiddleTimer.start()
                right_mid_lane_button.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                right_mid_button_is_clicked = !right_mid_button_is_clicked
            }
        }
        left_mid_lane_button.setOnClickListener {
            if (left_mid_button_is_clicked) {
                leftMiddleTimer.start()
                left_mid_lane_button.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                left_mid_button_is_clicked = !left_mid_button_is_clicked
            }
        }
        left_mid_lane_status.setOnClickListener {
            if (left_mid_button_is_clicked) {
                leftMiddleTimer.start()
                left_mid_lane_button.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                left_mid_button_is_clicked = !left_mid_button_is_clicked
            }
        }
        right_bottom_lane_button.setOnClickListener {
            if (right_bottom_button_is_clicked) {
                rightBottomTimer.start()
                right_bottom_lane_button.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                right_bottom_button_is_clicked = !right_bottom_button_is_clicked
            }
        }
        right_bottom_lane_status.setOnClickListener {
            if (right_bottom_button_is_clicked) {
                rightBottomTimer.start()
                right_bottom_lane_button.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                right_bottom_button_is_clicked = !right_bottom_button_is_clicked
            }
        }
        left_bottom_lane_button.setOnClickListener {
            if (left_bottom_button_is_clicked) {
                leftBottomTimer.start()
                left_bottom_lane_button.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                left_bottom_button_is_clicked = !left_bottom_button_is_clicked
            }
        }
        left_bottom_lane_status.setOnClickListener {
            if (left_bottom_button_is_clicked) {
                leftBottomTimer.start()
                left_bottom_lane_button.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                left_bottom_button_is_clicked = !left_bottom_button_is_clicked
            }
        }
        right_support_button.setOnClickListener {
            if (right_support_button_is_clicked) {
                rightSupportTimer.start()
                right_support_button.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                right_support_button_is_clicked = !right_support_button_is_clicked
            }
        }
        right_support_status.setOnClickListener {
            if (right_support_button_is_clicked) {
                rightSupportTimer.start()
                right_support_button.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                right_support_button_is_clicked = !right_support_button_is_clicked
            }
        }
        left_support_button.setOnClickListener {
            if (left_support_button_is_clicked) {
                leftSupportTimer.start()
                left_support_button.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                left_support_button_is_clicked = !left_support_button_is_clicked
            }
        }
        left_support_status.setOnClickListener {
            if (left_support_button_is_clicked) {
                leftSupportTimer.start()
                left_support_button.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                left_support_button_is_clicked = !left_support_button_is_clicked
            }
        }
        reset_button.setOnClickListener {
            recreate()
        }
    }
}




