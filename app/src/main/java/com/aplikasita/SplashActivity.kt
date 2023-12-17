package com.aplikasita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    //deklarasi variable timer splash screen
    private val SPLASH : Long = 3000 //delay 3 detik
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //kode untuk menjalankan main screen stelah timer splash screen habis

        Handler().postDelayed({
            startActivity(Intent(this,LoginActivity::class.java))
            finish()
        },SPLASH)

    }
}