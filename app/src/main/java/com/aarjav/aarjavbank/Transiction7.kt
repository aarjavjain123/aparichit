package com.aarjav.aarjavbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Transiction7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var u7 :Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transiction7)
        u7=findViewById(R.id.T7)
        u7.setOnClickListener{
            val intent= Intent(this@Transiction7,Users::class.java)
            startActivity(intent)
        }
    }
}