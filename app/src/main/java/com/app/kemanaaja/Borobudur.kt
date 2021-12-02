package com.app.kemanaaja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Borobudur : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_borobudur)

        val pesan = findViewById<Button>(R.id.btnPesan)
        val back = findViewById<ImageView>(R.id.backBorobudur)

        pesan.setOnClickListener {
            val intent = Intent(this, PesanActivity::class.java)
            startActivity(intent)
        }

        back.setOnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }

    }
}