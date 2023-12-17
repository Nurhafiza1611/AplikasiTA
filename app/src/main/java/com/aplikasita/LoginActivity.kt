package com.aplikasita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Handle "Daftar" click
        val txt_btn1 = findViewById(R.id.txt_register) as TextView
        txt_btn1.setOnClickListener {
            // Pindah ke halaman registrasi
            startActivity(Intent(this, RegisterActivity::class.java))
            // Selesaikan aktivitas saat ini agar tidak bisa kembali lagi
            finish();
        }

        val actButton3 = findViewById<Button>(R.id.btn_login)

        actButton3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish();
        }


    }
}