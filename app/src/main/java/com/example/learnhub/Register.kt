package com.example.learnhub

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)

        val btn = findViewById<Button>(R.id.btnbacklogin)
        btn.setOnClickListener {
            val Intent = Intent(this, Login::class.java)
            startActivity(Intent)
        }

        val btn4 = findViewById<Button>(R.id.btnreg)
        btn4.setOnClickListener {
            val Intent = Intent(this, Homepagee::class.java)
            startActivity(Intent)

        }
    }
}