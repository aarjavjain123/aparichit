package com.aarjav.aarjavbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Transiction3 : AppCompatActivity() {
    lateinit var u3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transiction3)
        u3=findViewById(R.id.T3)
        u3.setOnClickListener{
            val intent= Intent(this@Transiction3,Users::class.java)
            startActivity(intent)
        }
    }
}