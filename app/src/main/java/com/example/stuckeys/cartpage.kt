package com.example.stuckeys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cartpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cartpage)

        val btnpayment = findViewById<Button>(R.id.paymentbutton)

        btnpayment.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
        }
    }
}