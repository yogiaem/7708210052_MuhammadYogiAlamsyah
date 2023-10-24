package com.example.stuckeys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class loginpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)

        val btnforgot = findViewById<TextView>(R.id.l_forgot)

        btnforgot.setOnClickListener{
            val intent = Intent(this, forgotpasswordpage::class.java)
            startActivity(intent)
        }

        val btnlogin = findViewById<Button>(R.id.loginbutton)

        btnlogin.setOnClickListener{
            val intent = Intent(this,homepage::class.java)
            startActivity(intent)
        }

        val btnregister = findViewById<TextView>(R.id.l_txt3)

        btnregister.setOnClickListener{
            val intent = Intent(this,registerpage::class.java)
            startActivity(intent)
        }
    }
}