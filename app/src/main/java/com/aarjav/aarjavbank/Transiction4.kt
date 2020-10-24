package com.aarjav.aarjavbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Transiction4 : AppCompatActivity() {
    lateinit var u4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transiction4)
        u4=findViewById(R.id.T4)
        u4.setOnClickListener{
            val intent= Intent(this@Transiction4,Users::class.java)
            startActivity(intent)
        }
    }
}