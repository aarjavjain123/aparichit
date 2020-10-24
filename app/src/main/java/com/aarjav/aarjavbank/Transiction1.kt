package com.aarjav.aarjavbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Transiction1 : AppCompatActivity() {
    lateinit var u1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transiction1)
        u1=findViewById(R.id.T1)
        u1.setOnClickListener{
            val intent= Intent(this@Transiction1,Users::class.java)
            startActivity(intent)
        }
}}