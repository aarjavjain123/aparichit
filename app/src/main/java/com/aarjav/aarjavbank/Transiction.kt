package com.aarjav.aarjavbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Transiction : AppCompatActivity() {
    lateinit var u:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transiction)
        u=findViewById(R.id.T)
        u.setOnClickListener{
            val intent= Intent(this@Transiction,Users::class.java)
            startActivity(intent)
        }
    }
}