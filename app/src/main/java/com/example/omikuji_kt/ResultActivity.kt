package com.example.omikuji_kt

import Custom.CustomActivity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AlphaAnimation
import kotlinx.android.synthetic.main.activity_result.*
import kotlin.random.Random

class ResultActivity : CustomActivity() {

    private val rnd = Random
    private val number = rnd.nextInt(100)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        when (number) {
            in 0..9 -> resultText.setText(R.string.daikiti)
            in 10..19 -> resultText.setText(R.string.tyukiti)
            in 20..39 -> resultText.setText(R.string.kiti)
            in 40..59 -> resultText.setText(R.string.suekiti)
            in 60..69 -> resultText.setText(R.string.shokiti)
            in 70..89 -> resultText.setText(R.string.kyo)
            in 90..99 -> resultText.setText(R.string.daikyo)
        }

        Handler().postDelayed(Runnable {
            val alphaFadeIn = AlphaAnimation(0.0f, 1.0f)
            alphaFadeIn.duration = 2000
            alphaFadeIn.fillAfter = true
            resultText.startAnimation(alphaFadeIn)
        }, 1500)

        Handler().postDelayed(Runnable {
            val alphaFadeIn = AlphaAnimation(0.0f, 1.0f)
            alphaFadeIn.duration = 100
            alphaFadeIn.fillAfter = true
            retryButton.startAnimation(alphaFadeIn)
        }, 4000)

        retryButton.setOnClickListener {
            val intent = Intent(this, TopActivity::class.java)
            startActivity(intent)
        }
    }
}