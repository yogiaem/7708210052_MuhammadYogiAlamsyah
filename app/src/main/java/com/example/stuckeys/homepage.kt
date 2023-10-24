package com.example.stuckeys

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class homepage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        val btnprofile = findViewById<TextView>(R.id.hp_name)

        btnprofile.setOnClickListener {
            val intent = Intent(this, profilepage::class.java)
            startActivity(intent)
        }

        val btncart = findViewById<ImageView>(R.id.cartpict)

        btncart.setOnClickListener {
            val intent = Intent(this, cartpage::class.java)
            startActivity(intent)
        }
    }
}