package com.app.kemanaaja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        val bca = findViewById<ImageView>(R.id.btnBca)
        bca.setOnClickListener {
            val intent = Intent(this,BcaActivity::class.java)
            startActivity(intent)
        }
    }
}