package com.aarjav.aarjavbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Transiction2 : AppCompatActivity() {
    lateinit var u2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transiction2)
        u2=findViewById(R.id.T2)
        u2.setOnClickListener{
            val intent= Intent(this@Transiction2,Users::class.java)
            startActivity(intent)
        }
    }
}