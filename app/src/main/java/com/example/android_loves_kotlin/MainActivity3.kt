package com.example.android_loves_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val btn= findViewById<Button>(R.id.btn)
        val ratingBar =findViewById<RatingBar>(R.id.ratingBar)
        btn.setOnClickListener {
            val getRatingValue =ratingBar.rating
            Toast.makeText(this@MainActivity3,"Rating ="+getRatingValue, Toast.LENGTH_SHORT).show()
        }

    }
}