package com.example.stuckeys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_pindah = findViewById<Button>(R.id.btn_main)

        btn_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this, loginpage::class.java)

            startActivity(_intentPindah)
        }
    }
}