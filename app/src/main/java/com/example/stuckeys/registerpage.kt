package com.example.stuckeys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class registerpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registerpage)

        val btnregister2 = findViewById<Button>(R.id.registerbutton)

        btnregister2.setOnClickListener{
            val intent = Intent (this, homepage::class.java)
            startActivity(intent)
        }

        val btnlogin2 = findViewById<TextView>(R.id.r_txt3)

        btnlogin2.setOnClickListener{
            val intent = Intent (this, loginpage::class.java)
            startActivity(intent)
        }
    }
}