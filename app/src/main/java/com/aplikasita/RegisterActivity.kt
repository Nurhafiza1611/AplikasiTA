package com.aplikasita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val actButton2 = findViewById<Button>(R.id.btn_signUp)

        actButton2.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish();
        }
        val txt_btn2 = findViewById(R.id.txt_login) as TextView
        txt_btn2.setOnClickListener {
            // Pindah ke halaman registrasi
            startActivity(Intent(this, LoginActivity::class.java))
            // Selesaikan aktivitas saat ini agar tidak bisa kembali lagi
            finish();
        }
    }

}