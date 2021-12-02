package com.app.kemanaaja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class PesanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesan)

        val btnlanjut = findViewById<Button>(R.id.btnLanjut)
        val back = findViewById<ImageView>(R.id.backPesan)

        btnlanjut.setOnClickListener {
             val intent = Intent(this,PaymentActivity::class.java)
            startActivity(intent)
        }

        back.setOnClickListener {
            val intent = Intent(this,Borobudur::class.java)
            startActivity(intent)
        }
    }
}