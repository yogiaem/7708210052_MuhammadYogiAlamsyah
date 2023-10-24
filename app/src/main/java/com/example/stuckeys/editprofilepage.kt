package com.example.stuckeys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class editprofilepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editprofilepage)

        val btnsave = findViewById<Button>(R.id.saveButton)

        btnsave.setOnClickListener {
            val intent = Intent(this, profilepage::class.java)
            startActivity(intent)
        }
    }
}