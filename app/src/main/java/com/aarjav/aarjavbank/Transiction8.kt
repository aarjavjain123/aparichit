package com.aarjav.aarjavbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Transiction8 : AppCompatActivity() {
    lateinit var u8:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transiction8)
        u8=findViewById(R.id.T8)
        u8.setOnClickListener{
            val intent= Intent(this@Transiction8,Users::class.java)
            startActivity(intent)
        }
    }
}