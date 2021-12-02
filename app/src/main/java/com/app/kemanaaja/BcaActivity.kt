package com.app.kemanaaja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BcaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bca)

        val bayar = findViewById<Button>(R.id.btnbayar)

        bayar.setOnClickListener {
            val intent = Intent(this,SuccesActivity::class.java)
            startActivity(intent)
        }
    }
}