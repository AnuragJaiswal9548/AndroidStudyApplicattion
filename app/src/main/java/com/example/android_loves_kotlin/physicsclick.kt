package com.example.android_loves_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class physicsclick : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_physicsclick)


        val phy =findViewById<CardView>(R.id.subphy6)
        phy.setOnClickListener {
            val intent = Intent(this@physicsclick,phyclick1::class.java)
            startActivity(intent)
        }

        val mpf =findViewById<CardView>(R.id.subphy7)
        mpf.setOnClickListener {
            val intent = Intent(this@physicsclick ,phyclick7::class.java)
            startActivity(intent)
        }

        val wave =findViewById<CardView>(R.id.subphy10)
        wave.setOnClickListener {
            val intent = Intent(this@physicsclick ,phyclick10::class.java)
            startActivity(intent)
        }

        val law_m =findViewById<CardView>(R.id.subphy8)
        law_m.setOnClickListener {
            val intent = Intent(this@physicsclick ,phyclick8::class.java)
            startActivity(intent)
        }

        val thermo =findViewById<CardView>(R.id.subphy9)
        thermo.setOnClickListener {
            val intent = Intent(this@physicsclick ,phyclick9::class.java)
            startActivity(intent)
        }

        val waves_opt =findViewById<CardView>(R.id.subphy12)
        waves_opt.setOnClickListener {
            val intent = Intent(this@physicsclick ,phyclick12::class.java)
            startActivity(intent)
        }

        val e_c_f =findViewById<CardView>(R.id.subphy11)
        e_c_f.setOnClickListener {
            val intent = Intent(this@physicsclick ,phyclick11::class.java)
            startActivity(intent)
        }

        val magnetism =findViewById<CardView>(R.id.subphy5)
        magnetism.setOnClickListener {
            val intent = Intent(this@physicsclick ,phyclick5::class.java)
            startActivity(intent)
        }

        val curr_e =findViewById<CardView>(R.id.subphy2)
        curr_e.setOnClickListener {
            val intent = Intent(this@physicsclick ,phyclick2::class.java)
            startActivity(intent)
        }

    }
}