package com.example.stuckeys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class profilepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profilepage)

        val btnback = findViewById<ImageView>(R.id.back_pf)

        btnback.setOnClickListener {
            val intent = Intent(this, profilepage::class.java)
            startActivity(intent)
        }

        val btnedit = findViewById<Button>(R.id.editButton)

        btnedit.setOnClickListener {
            val intent = Intent(this, editprofilepage::class.java)
            startActivity(intent)
        }
    }
}