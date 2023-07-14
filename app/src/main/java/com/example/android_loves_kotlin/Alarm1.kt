package com.example.android_loves_kotlin

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Alarm1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm1)
        var mp=MediaPlayer.create(applicationContext,R.raw.ringtone)
        mp.start()

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
         mp.stop()
        }

    }
}