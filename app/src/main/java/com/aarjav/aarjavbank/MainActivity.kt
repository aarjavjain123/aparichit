package com.aarjav.aarjavbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var users: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        users=findViewById(R.id.txtUSERS)
        users.setOnClickListener{
            val intent= Intent(this@MainActivity,Users::class.java)
            startActivity(intent)
        }
    }
}