package com.example.omikuji_kt

import Custom.CustomActivity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationSet
import android.view.animation.RotateAnimation
import android.view.animation.TranslateAnimation
import kotlinx.android.synthetic.main.android_top.*

class TopActivity : CustomActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.android_top)

        ivOmikuji.setOnClickListener {

            // 上下に振るアニメーション
            val translate = TranslateAnimation(0f, 0f, 0f, -200f)
            translate.repeatMode = Animation.REVERSE
            translate.repeatCount = 5
            translate.duration = 200

            // 傾けるアニメーション
            val rotate = RotateAnimation(0f, 36f, ivOmikuji.width / 2f, ivOmikuji.height / 2f)
            rotate.duration = 250

            // アニメーションの合成
            val set = AnimationSet(true)
            set.addAnimation(translate)
            set.addAnimation(rotate)

            ivOmikuji.startAnimation(set)

            Handler().postDelayed(Runnable {
                val intent = Intent(this, ResultActivity::class.java)
                startActivity(intent)
            }, 2500)
        }
    }
}