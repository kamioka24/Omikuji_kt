package com.example.omikuji_kt

import Custom.CustomActivity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AlphaAnimation
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : CustomActivity() {

    private val number = (1..100).random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        when (number) {
            in 1..10 -> resultText.setText(R.string.daikiti)
            in 11..20 -> resultText.setText(R.string.tyukiti)
            in 21..40 -> resultText.setText(R.string.kiti)
            in 41..60 -> resultText.setText(R.string.suekiti)
            in 61..70 -> resultText.setText(R.string.shokiti)
            in 71..90 -> resultText.setText(R.string.kyo)
            in 91..100 -> resultText.setText(R.string.daikyo)
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