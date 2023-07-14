package com.example.android_loves_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class mthclick : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mthclick)

        val mth1 =findViewById<CardView>(R.id.submth1)
        mth1.setOnClickListener {
            val intent = Intent(this@mthclick , mthclick1::class.java)
            startActivity(intent)
        }
        val mth2 =findViewById<CardView>(R.id.submth2)
        mth2.setOnClickListener {
            val intent = Intent(this@mthclick , mthclick2::class.java)
            startActivity(intent)
        }

        val mth3 =findViewById<CardView>(R.id.submth3)
        mth3.setOnClickListener {
            val intent = Intent(this@mthclick , mthclick3::class.java)
            startActivity(intent)
        }
        val mth4 =findViewById<CardView>(R.id.submth4)
        mth4.setOnClickListener {
            val intent = Intent(this@mthclick , mthclick4::class.java)
            startActivity(intent)
        }
        val mth5 =findViewById<CardView>(R.id.submth5)
        mth5.setOnClickListener {
            val intent = Intent(this@mthclick , mthclick5::class.java)
            startActivity(intent)
        }

        val mth6 =findViewById<CardView>(R.id.submth6)
        mth6.setOnClickListener {
            val intent = Intent(this@mthclick , mthclick6::class.java)
            startActivity(intent)
        }

        val mth7 =findViewById<CardView>(R.id.submth7)
        mth7.setOnClickListener {
            val intent = Intent(this@mthclick , mthclick7::class.java)
            startActivity(intent)
        }

        val mth8 =findViewById<CardView>(R.id.submth8)
        mth8.setOnClickListener {
            val intent = Intent(this@mthclick , mthclick8::class.java)
            startActivity(intent)
        }

        val mth9 =findViewById<CardView>(R.id.submth9)
        mth9.setOnClickListener {
            val intent = Intent(this@mthclick , mthclick9::class.java)
            startActivity(intent)
        }


        val mth10 =findViewById<CardView>(R.id.submth10)
        mth10.setOnClickListener {
            val intent = Intent(this@mthclick , mthclick10::class.java)
            startActivity(intent)
        }


        val mth11 =findViewById<CardView>(R.id.submth11)
        mth11.setOnClickListener {
            val intent = Intent(this@mthclick , mthclick11::class.java)
            startActivity(intent)
        }


        val mth12 =findViewById<CardView>(R.id.submth12)
        mth12.setOnClickListener {
            val intent = Intent(this@mthclick , mthclick12::class.java)
            startActivity(intent)
        }


        val mth13 =findViewById<CardView>(R.id.submth13)
        mth13.setOnClickListener {
            val intent = Intent(this@mthclick , mthclick13::class.java)
            startActivity(intent)
        }



    }
}