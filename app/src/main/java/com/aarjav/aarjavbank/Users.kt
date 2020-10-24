package com.aarjav.aarjavbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Users : AppCompatActivity() {
    lateinit var transiction: Button
    lateinit var transiction1: Button
    lateinit var transiction2: Button
    lateinit var transiction3: Button
    lateinit var transiction4: Button
    lateinit var transiction5: Button
    lateinit var transiction6: Button
    lateinit var transiction7: Button
    lateinit var transiction8: Button
    lateinit var transiction9: Button
    lateinit var transiction10: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users)
        title="USER'S DETAILS"
        transiction=findViewById(R.id.Transfer1)
        transiction.setOnClickListener{
            val intent= Intent(this@Users,Transiction::class.java)
            startActivity(intent)
        }
        transiction1=findViewById(R.id.Transfer2)
        transiction1.setOnClickListener{
            val intent= Intent(this@Users,Transiction1::class.java)
            startActivity(intent)
        }
        transiction2=findViewById(R.id.Transfer3)
        transiction2.setOnClickListener{
            val intent= Intent(this@Users,Transiction2::class.java)
            startActivity(intent)
        }

        transiction3=findViewById(R.id.Transfer4)
        transiction3.setOnClickListener{
            val intent= Intent(this@Users,Transiction3::class.java)
            startActivity(intent)
        }
        transiction4=findViewById(R.id.Transfer5)
        transiction4.setOnClickListener{
            val intent= Intent(this@Users,Transiction4::class.java)
            startActivity(intent)
        }
        transiction5=findViewById(R.id.Transfer6)
        transiction5.setOnClickListener{
            val intent= Intent(this@Users,Transiction5::class.java)
            startActivity(intent)
        }
        transiction6=findViewById(R.id.Transfer7)
        transiction6.setOnClickListener{
            val intent= Intent(this@Users,Transiction6::class.java)
            startActivity(intent)
        }

        transiction7=findViewById(R.id.Transfer8)
        transiction7.setOnClickListener{
            val intent= Intent(this@Users,Transiction7::class.java)
            startActivity(intent)
        }
        transiction8=findViewById(R.id.Transfer9)
        transiction8.setOnClickListener{
            val intent= Intent(this@Users,Transiction8::class.java)
            startActivity(intent)
        }
        transiction9=findViewById(R.id.Transfer10)
        transiction9.setOnClickListener{
            val intent= Intent(this@Users,Transiction9::class.java)
            startActivity(intent)
        }
        transiction10=findViewById(R.id.Transfer11)
        transiction10.setOnClickListener{
            val intent= Intent(this@Users,Transiction10::class.java)
            startActivity(intent)
        }

    }
    }

