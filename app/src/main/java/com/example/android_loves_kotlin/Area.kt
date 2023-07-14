package com.example.android_loves_kotlin

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Area : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area)

        val button= findViewById<Button>(R.id.button)
        val editText= findViewById<EditText>(R.id.editText)
        button.setOnClickListener {
            var sec=editText.text.toString().toInt()
            var i = Intent(applicationContext,MyBroadcastReceiver::class.java)
            var pi=PendingIntent.getBroadcast(applicationContext,111,i,0)
            var am:AlarmManager= getSystemService(Context.ALARM_SERVICE)as AlarmManager
            am.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(sec*1000),pi)
            Toast.makeText(applicationContext,"Alarm is set for $sec seconds",Toast.LENGTH_LONG).show()

        }
    }
}