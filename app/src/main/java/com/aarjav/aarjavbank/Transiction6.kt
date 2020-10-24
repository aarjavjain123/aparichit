package com.aarjav.aarjavbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Transiction6 : AppCompatActivity() {
    lateinit var u6 :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transiction6)
        u6=findViewById(R.id.T6)
        u6.setOnClickListener{
            val intent= Intent(this@Transiction6,Users::class.java)
            startActivity(intent)
        }
    }
}