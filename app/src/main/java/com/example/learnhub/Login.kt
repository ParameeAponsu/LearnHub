package com.example.learnhub


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val btn1 = findViewById<Button>(R.id.btnsignup)
        btn1.setOnClickListener {
            val Intent = Intent(this, Register::class.java)
            startActivity(Intent)

        }

            val btn2 = findViewById<Button>(R.id.btnsignin)
            btn2.setOnClickListener {
                val Intent = Intent(this, Homepagee::class.java)
                startActivity(Intent)


            }
        }
    }

