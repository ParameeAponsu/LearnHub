package com.example.learnhub

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class Homepagee : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    private fun findNavController(bottomNavigationView: Int) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepagee)

        val btn = findViewById<Button>(R.id.button5)
        btn.setOnClickListener {
            val Intent = Intent(this, Courses::class.java)
            startActivity(Intent)
        }

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController = findNavController(R.id.bottomNavigationView)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.profile -> {
                    startActivity(Intent(this, Prof::class.java))
                    true
                }

                R.id.course -> {
                    startActivity(Intent(this, Courses::class.java))
                    true
                }

                else -> {
                    false
                }
            }


        }
    }


}






