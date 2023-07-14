package com.example.android_loves_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity4 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)


        val subchem1 =findViewById<CardView>(R.id.subchem1)
        subchem1.setOnClickListener {
            val intent = Intent(this@MainActivity4 , chemkotlin2::class.java)
            startActivity(intent)
        }
        val subchem2 =findViewById<CardView>(R.id.subchem2)
        subchem2.setOnClickListener {
            val intent = Intent(this@MainActivity4 , chemkotlin3::class.java)
            startActivity(intent)
        }
        val subchem3 =findViewById<CardView>(R.id.subchem3)
        subchem3.setOnClickListener {
            val intent = Intent(this@MainActivity4 , chemkotlin4::class.java)
            startActivity(intent)
        }
        val subchem4 =findViewById<CardView>(R.id.subchem4)
        subchem4.setOnClickListener {
            val intent = Intent(this@MainActivity4 , chemkotlin5::class.java)
            startActivity(intent)
        }
        val subchem5 =findViewById<CardView>(R.id.subchem5)
        subchem5.setOnClickListener {
            val intent = Intent(this@MainActivity4 , chemkotlin6::class.java)
            startActivity(intent)
        }
        val subchem6 =findViewById<CardView>(R.id.subchem6)
        subchem6.setOnClickListener {
            val intent = Intent(this@MainActivity4 , chemkotlin7::class.java)
            startActivity(intent)
        }
        val subchem7 =findViewById<CardView>(R.id.subchem7)
        subchem7.setOnClickListener {
            val intent = Intent(this@MainActivity4 , chemkotlin8::class.java)
            startActivity(intent)
        }
        val subchem8 =findViewById<CardView>(R.id.subchem8)
        subchem8.setOnClickListener {
            val intent = Intent(this@MainActivity4 , chemkotlin9::class.java)
            startActivity(intent)
        }
        val subchem9 =findViewById<CardView>(R.id.subchem9)
        subchem9.setOnClickListener {
            val intent = Intent(this@MainActivity4 , chemkotlin10::class.java)
            startActivity(intent)
        }

        val subchem10 =findViewById<CardView>(R.id.subchem10)
        subchem10.setOnClickListener {
            val intent = Intent(this@MainActivity4 , chemkotlin11::class.java)
            startActivity(intent)
        }
        val subchem11 =findViewById<CardView>(R.id.subchem11)
        subchem11.setOnClickListener {
            val intent = Intent(this@MainActivity4 , chemkotlin12::class.java)
            startActivity(intent)
        }
        val subchem12 =findViewById<CardView>(R.id.subchem12)
        subchem12.setOnClickListener {
            val intent = Intent(this@MainActivity4 , chemkotlin13::class.java)
            startActivity(intent)
        }

        val subchem13 =findViewById<CardView>(R.id.subchem13)
        subchem13.setOnClickListener {
            val intent = Intent(this@MainActivity4 , chemkotlin14::class.java)
            startActivity(intent)
        }

        val subchem14 =findViewById<CardView>(R.id.subchem14)
        subchem14.setOnClickListener {
            val intent = Intent(this@MainActivity4 , chemkotlin15::class.java)
            startActivity(intent)
        }
        val subchem15 =findViewById<CardView>(R.id.subchem15)
        subchem15.setOnClickListener {
            val intent = Intent(this@MainActivity4 , chemkotlin16::class.java)
            startActivity(intent)
        }
        val subchem16 =findViewById<CardView>(R.id.subchem16)
        subchem16.setOnClickListener {
            val intent = Intent(this@MainActivity4 , chemkotlin17::class.java)
            startActivity(intent)
        }


    }
}
