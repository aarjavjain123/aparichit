package com.aarjav.aarjavbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Transiction10 : AppCompatActivity() {
    lateinit var u10:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transiction10)
        u10=findViewById(R.id.T10)
        u10.setOnClickListener{
            val intent= Intent(this@Transiction10,Users::class.java)
            startActivity(intent)
        }
    }
}