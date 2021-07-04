package com.example.omikuji_kt

import Custom.CustomActivity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.android_top.*

class TopActivity : CustomActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.android_top)

        ivOmikuji.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }
    }
}