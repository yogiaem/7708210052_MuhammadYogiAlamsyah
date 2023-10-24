package com.example.stuckeys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class forgotpasswordpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotpasswordpage)

        val btnbackfp = findViewById<Button>(R.id.back_forgot)

        btnbackfp.setOnClickListener {
            val intent = Intent(this, loginpage::class.java)
            startActivity(intent)
        }
    }
}