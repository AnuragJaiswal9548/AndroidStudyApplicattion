package com.example.android_loves_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class UnitConverter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unit_converter)

        val back_btn =findViewById<ImageView>(R.id.back_btn)
        back_btn.setOnClickListener {
            val intent  =Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        val alarm= findViewById<CardView>(R.id.cardview_length)
        alarm.setOnClickListener {
            val intent = Intent(this@UnitConverter,Area::class.java)
            startActivity(intent)
            finish()
        }
        val calculator = findViewById<CardView>(R.id.cardview_area)
        calculator.setOnClickListener {
            val intent = Intent(this@UnitConverter,Calculator::class.java)
            startActivity(intent)
            finish()
        }

    }
}