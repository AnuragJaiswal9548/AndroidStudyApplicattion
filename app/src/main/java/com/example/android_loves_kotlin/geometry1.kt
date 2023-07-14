package com.example.android_loves_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class geometry1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biology)

        val bio_click1 =findViewById<CardView>(R.id.subbio1)
        bio_click1.setOnClickListener {
            val intent =Intent(this@geometry1 ,bioclick1::class.java)
            startActivity(intent)
        }

        val bio_click2 =findViewById<CardView>(R.id.subbio2)
        bio_click2.setOnClickListener {
            val intent =Intent(this@geometry1 ,bioclick2::class.java)
            startActivity(intent)
        }
        val bio_click3 =findViewById<CardView>(R.id.subbio3)
        bio_click3.setOnClickListener {
            val intent =Intent(this@geometry1 ,bioclick3::class.java)
            startActivity(intent)
        }

        val bio_click4 =findViewById<CardView>(R.id.subbio4)
        bio_click4.setOnClickListener {
            val intent =Intent(this@geometry1 ,bioclick4::class.java)
            startActivity(intent)
        }

        val bio_click5 =findViewById<CardView>(R.id.subbio5)
        bio_click5.setOnClickListener {
            val intent =Intent(this@geometry1 ,bioclick5::class.java)
            startActivity(intent)
        }

        val bio_click6 =findViewById<CardView>(R.id.subbio6)
        bio_click6.setOnClickListener {
            val intent =Intent(this@geometry1 ,bioclick6::class.java)
            startActivity(intent)
        }

        val bio_click7 =findViewById<CardView>(R.id.subbio7)
        bio_click7.setOnClickListener {
            val intent =Intent(this@geometry1 ,bioclick7::class.java)
            startActivity(intent)
        }

        val bio_click8 =findViewById<CardView>(R.id.subbio8)
        bio_click8.setOnClickListener {
            val intent =Intent(this@geometry1 ,bioclick8::class.java)
            startActivity(intent)
        }

        val bio_click9 =findViewById<CardView>(R.id.subbio9)
        bio_click9.setOnClickListener {
            val intent =Intent(this@geometry1 ,bioclick9::class.java)
            startActivity(intent)
        }

        val bio_click10 =findViewById<CardView>(R.id.subbio10)
        bio_click10.setOnClickListener {
            val intent =Intent(this@geometry1 ,bioclick10::class.java)
            startActivity(intent)
        }

        val bio_click11 =findViewById<CardView>(R.id.subbio11)
        bio_click11.setOnClickListener {
            val intent = Intent(this@geometry1, bioclick11::class.java)
            startActivity(intent)
        }

        val bio_click12 =findViewById<CardView>(R.id.subbio12)
        bio_click12.setOnClickListener {
            val intent = Intent(this@geometry1, bioclick12::class.java)
            startActivity(intent)
        }

        val bio_click13 =findViewById<CardView>(R.id.subbio13)
        bio_click13.setOnClickListener {
            val intent = Intent(this@geometry1, bioclick13::class.java)
            startActivity(intent)
        }

        val bio_click14 =findViewById<CardView>(R.id.subbio14)
        bio_click14.setOnClickListener {
            val intent = Intent(this@geometry1, bioclick14::class.java)
            startActivity(intent)
        }
        val bio_click15 =findViewById<CardView>(R.id.subbio15)
        bio_click15.setOnClickListener {
            val intent = Intent(this@geometry1, bioclick15::class.java)
            startActivity(intent)
        }

        val bio_click16 =findViewById<CardView>(R.id.subbio16)
        bio_click16.setOnClickListener {
            val intent = Intent(this@geometry1, bioclick16::class.java)
            startActivity(intent)
        }







    }
}