package com.aarjav.aarjavbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Transiction9 : AppCompatActivity() {
    lateinit var u9:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transiction9)
        u9=findViewById(R.id.T9)
        u9.setOnClickListener{
            val intent= Intent(this@Transiction9,Users::class.java)
            startActivity(intent)
        }
    }
}