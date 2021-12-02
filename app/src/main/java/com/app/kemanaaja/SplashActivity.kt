package com.app.kemanaaja

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class SplashActivity : AppCompatActivity() {

    private lateinit var ivsplash: ImageView
    private lateinit var tvsplah: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        val fadeAnimation = AnimationUtils.loadAnimation(this, R.anim.stb)

        ivsplash = findViewById(R.id.ivSplash)
        tvsplah = findViewById(R.id.tvSplash)

        ivsplash.startAnimation(fadeAnimation)
        tvsplah.startAnimation(fadeAnimation)

        val splashTo = 3000
        val homeIntent = Intent(this, LoginActivity::class.java)

        Handler().postDelayed({
            startActivity(homeIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
            finish()
        }, splashTo.toLong())

    }
}