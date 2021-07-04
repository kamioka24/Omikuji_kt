package com.example.omikuji_kt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_launch.*

class LaunchActivity : AppCompatActivity() {

    private val handler = Handler()
    private val runnable = Runnable {
        val intent = Intent(this, TopActivity::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)

        startButton.setOnClickListener {
            val intent = Intent(this, TopActivity::class.java)
            startActivity(intent)
        }

        handler.postDelayed(runnable, 8000)
    }

    override fun onResume() {
        super.onResume()

        handler.postDelayed(runnable, 8000)
    }
}