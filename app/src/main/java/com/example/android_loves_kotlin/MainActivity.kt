package com.example.android_loves_kotlin


import android.annotation.SuppressLint
import android.content.Intent

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView



class MainActivity : AppCompatActivity() {

    var mBrightnessLevel = 0.5f


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Profile image button
        val button = findViewById<ImageButton>(R.id.img1)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }


        //

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomnavigationview)

        val fragmentContainer = findViewById<View>(R.id.fragment_container)

        bottomNav.setupWithNavController(fragmentContainer.findNavController())

        // bottom navigation 2 button
        val button2 = findViewById<FrameLayout>(R.id.kotlin1Fragment)
        button2.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }

        // button navigation 3  button
        var button3 = findViewById<FrameLayout>(R.id.kotlin2Fragment)
        button3.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity3::class.java)
            startActivity(intent)
        }

        //set onclick on cardview chemistry

        var button_chemistry = findViewById<CardView>(R.id.chemistry)
        button_chemistry.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity4::class.java)
            startActivity(intent)
        }

        // set onclick on cardview Unit Converter
        var unit_Converter = findViewById<CardView>(R.id.unit_converter)
        unit_Converter.setOnClickListener {
            val intent = Intent(this@MainActivity, UnitConverter::class.java)
            startActivity(intent)
        }


        var button_geometry = findViewById<CardView>(R.id.geometry)
        button_geometry.setOnClickListener {
            val intent = Intent(this@MainActivity, geometry1::class.java)
            startActivity(intent)


        }

        var button_physics= findViewById<CardView>(R.id.physics)
        button_physics.setOnClickListener {
            val intent = Intent(this@MainActivity,physicsclick::class.java)
            startActivity(intent)


        }

        var button_maths= findViewById<CardView>(R.id.maths)
        button_maths.setOnClickListener {
            val intent = Intent(this@MainActivity,mthclick::class.java)
            startActivity(intent)


        }
        var button_form= findViewById<CardView>(R.id.form)
        button_form.setOnClickListener {
            val intent = Intent(this@MainActivity,Form::class.java)
            startActivity(intent)


        }

    }

}
