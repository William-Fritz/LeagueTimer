package com.example.prototype1

import android.graphics.Color
import android.graphics.PorterDuff
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageButton
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var timer: CountDownTimer

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

        //create variables for all imagebutton and textview

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

        // timer

        var rightTopTimer = object: CountDownTimer(5000,1000){
            override fun onTick(millisUntilFinished: Long) {
                rightTopLaneStatus.setText("${millisUntilFinished/1000 + 1}")
            }
            override fun onFinish() {
                rightTopLaneStatus.setText(getString(R.string.ready))
                rightTopLaneButton.setColorFilter(null)
                rightTopButtonIsClicked = !rightTopButtonIsClicked
            }
        }
        var leftJungleTimer = object: CountDownTimer(5000,1000){
            override fun onTick(millisUntilFinished: Long) {
                leftJungleStatus.setText("${millisUntilFinished/1000 + 1}")
            }
            override fun onFinish() {
                leftJungleStatus.setText(getString(R.string.ready))
                leftJungleButton.setColorFilter(null)
                leftJungleButtonIsClicked = !leftJungleButtonIsClicked
            }
        }
        var rightJungleTimer = object: CountDownTimer(5000,1000){
            override fun onTick(millisUntilFinished: Long) {
                rightJungleStatus.setText("${millisUntilFinished/1000 + 1}")
            }
            override fun onFinish() {
                rightJungleStatus.setText(getString(R.string.ready))
                rightJungleButton.setColorFilter(null)
                rightJungleButtonIsClicked = !rightJungleButtonIsClicked
            }
        }
        var leftMiddleTimer = object: CountDownTimer(5000,1000){
            override fun onTick(millisUntilFinished: Long) {
                leftMidLaneStatus.setText("${millisUntilFinished/1000 + 1}")
            }
            override fun onFinish() {
                leftMidLaneStatus.setText(getString(R.string.ready))
                leftMidLaneButton.setColorFilter(null)
                leftMidButtonIsClicked = !leftMidButtonIsClicked
            }
        }
        var rightMiddleTimer = object: CountDownTimer(5000,1000){
            override fun onTick(millisUntilFinished: Long) {
                rightMidLaneStatus.setText("${millisUntilFinished/1000 + 1}")
            }
            override fun onFinish() {
                rightMidLaneStatus.setText(getString(R.string.ready))
                rightMidLaneButton.setColorFilter(null)
                rightMidButtonIsClicked = !rightMidButtonIsClicked
            }
        }
        var leftBottomTimer = object: CountDownTimer(5000,1000){
            override fun onTick(millisUntilFinished: Long) {
                leftBottomLaneStatus.setText("${millisUntilFinished/1000 + 1}")
            }
            override fun onFinish() {
                leftBottomLaneStatus.setText(getString(R.string.ready))
                leftBottomLaneButton.setColorFilter(null)
                leftBottomButtonIsClicked = !leftBottomButtonIsClicked
            }
        }
        var rightBottomTimer = object: CountDownTimer(5000,1000){
            override fun onTick(millisUntilFinished: Long) {
                rightBottomLaneStatus.setText("${millisUntilFinished/1000 + 1}")
            }
            override fun onFinish() {
                rightBottomLaneStatus.setText(getString(R.string.ready))
                rightBottomLaneButton.setColorFilter(null)
                rightBottomButtonIsClicked = !rightBottomButtonIsClicked
            }
        }
        var leftSupportTimer = object: CountDownTimer(5000,1000){
            override fun onTick(millisUntilFinished: Long) {
                leftSupportStatus.setText("${millisUntilFinished/1000 + 1}")
            }
            override fun onFinish() {
                leftSupportStatus.setText(getString(R.string.ready))
                leftSupportButton.setColorFilter(null)
                leftSupportButtonIsClicked = !leftSupportButtonIsClicked
            }
        }
        var rightSupportTimer = object: CountDownTimer(5000,1000){
            override fun onTick(millisUntilFinished: Long) {
                rightSupportStatus.setText("${millisUntilFinished/1000 + 1}")
            }
            override fun onFinish() {
                rightSupportStatus.setText(getString(R.string.ready))
                rightSupportButton.setColorFilter(null)
                rightSupportButtonIsClicked = !rightSupportButtonIsClicked
            }
        }

        //button listener
        rightTopLaneButton.setOnClickListener {
            if (rightTopButtonIsClicked) {

                rightTopTimer.start()
                rightTopLaneButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                rightTopButtonIsClicked = !rightTopButtonIsClicked
            }
        }
        rightTopLaneStatus.setOnClickListener{
            if (rightTopButtonIsClicked) {
                rightTopTimer.start()
                rightTopLaneButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                rightTopButtonIsClicked = !rightTopButtonIsClicked
            }
        }
        leftTopLaneButton.setOnClickListener {
            if (lefTopButtonIsClicked) {
                object: CountDownTimer(buttonCooldowns[leftTopButtonType]!! * 1000,1000){
                    override fun onTick(millisUntilFinished: Long) {
                        leftTopLaneStatus.setText("${millisUntilFinished/1000 + 1}")
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
        leftTopLaneStatus.setOnClickListener{
            if (lefTopButtonIsClicked) {
                object: CountDownTimer(buttonCooldowns[leftTopButtonType]!! * 1000,1000){
                    override fun onTick(millisUntilFinished: Long) {
                        leftTopLaneStatus.setText("${millisUntilFinished/1000 + 1}")
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
        rightJungleButton.setOnClickListener {
            if (rightJungleButtonIsClicked) {
                rightJungleTimer.start()
                rightJungleButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                rightJungleButtonIsClicked = !rightJungleButtonIsClicked
            }
        }
        rightJungleStatus.setOnClickListener{
            if (rightJungleButtonIsClicked) {
                rightJungleTimer.start()
                rightJungleButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                rightJungleButtonIsClicked = !rightJungleButtonIsClicked
            }
        }
        leftJungleButton.setOnClickListener {
            if (leftJungleButtonIsClicked) {
                leftJungleTimer.start()
                leftJungleButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                leftJungleButtonIsClicked = !leftJungleButtonIsClicked
            }
        }
        leftJungleStatus.setOnClickListener {
            if (leftJungleButtonIsClicked) {
                leftJungleTimer.start()
                leftJungleButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                leftJungleButtonIsClicked = !leftJungleButtonIsClicked
            }
        }
        rightMidLaneButton.setOnClickListener {
            if (rightMidButtonIsClicked) {
                rightMiddleTimer.start()
                rightMidLaneButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                rightMidButtonIsClicked = !rightMidButtonIsClicked
            }
        }
        rightMidLaneStatus.setOnClickListener {
            if (rightMidButtonIsClicked) {
                rightMiddleTimer.start()
                rightMidLaneButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                rightMidButtonIsClicked = !rightMidButtonIsClicked
            }
        }
        leftMidLaneButton.setOnClickListener {
            if (leftMidButtonIsClicked) {
                leftMiddleTimer.start()
                leftMidLaneButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                leftMidButtonIsClicked = !leftMidButtonIsClicked
            }
        }
        leftMidLaneStatus.setOnClickListener {
            if (leftMidButtonIsClicked) {
                leftMiddleTimer.start()
                leftMidLaneButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                leftMidButtonIsClicked = !leftMidButtonIsClicked
            }
        }
        rightBottomLaneButton.setOnClickListener {
            if (rightBottomButtonIsClicked) {
                rightBottomTimer.start()
                rightBottomLaneButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                rightBottomButtonIsClicked = !rightBottomButtonIsClicked
            }
        }
        rightBottomLaneStatus.setOnClickListener {
            if (rightBottomButtonIsClicked) {
                rightBottomTimer.start()
                rightBottomLaneButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                rightBottomButtonIsClicked = !rightBottomButtonIsClicked
            }
        }
        leftBottomLaneButton.setOnClickListener {
            if (leftBottomButtonIsClicked) {
                leftBottomTimer.start()
                leftBottomLaneButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                leftBottomButtonIsClicked = !leftBottomButtonIsClicked
            }
        }
        leftBottomLaneStatus.setOnClickListener {
            if (leftBottomButtonIsClicked) {
                leftBottomTimer.start()
                leftBottomLaneButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                leftBottomButtonIsClicked = !leftBottomButtonIsClicked
            }
        }
        rightSupportButton.setOnClickListener {
            if (rightSupportButtonIsClicked) {
                rightSupportTimer.start()
                rightSupportButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                rightSupportButtonIsClicked = !rightSupportButtonIsClicked
            }
        }
        rightSupportStatus.setOnClickListener {
            if (rightSupportButtonIsClicked) {
                rightSupportTimer.start()
                rightSupportButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                rightSupportButtonIsClicked = !rightSupportButtonIsClicked
            }
        }
        leftSupportButton.setOnClickListener {
            if (leftSupportButtonIsClicked) {
                leftSupportTimer.start()
                leftSupportButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                leftSupportButtonIsClicked = !leftSupportButtonIsClicked
            }
        }
        leftSupportStatus.setOnClickListener {
            if (leftSupportButtonIsClicked) {
                leftSupportTimer.start()
                leftSupportButton.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                leftSupportButtonIsClicked = !leftSupportButtonIsClicked
            }
        }
        resetButton.setOnClickListener {
            recreate()
        }
    }
}




