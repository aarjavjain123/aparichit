package com.aarjav.aarjavbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Transiction5 : AppCompatActivity() {
    lateinit var u5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transiction5)
        u5=findViewById(R.id.T5)
        u5.setOnClickListener{
            val intent= Intent(this@Transiction5,Users::class.java)
            startActivity(intent)
        }
    }
}