package com.example.android_loves_kotlin

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*
import java.util.*

class Form : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)


        val image1=findViewById<ImageView>(R.id.image1)
        val ed1 =findViewById<EditText>(R.id.ed1)
        val ed2 =findViewById<EditText>(R.id.ed2)
        val ed5 =findViewById<EditText>(R.id.ed2)
        ed5.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (!android.util.Patterns.EMAIL_ADDRESS.matcher(p0).matches())
                    ed5.setError("Invalid Email Add")
            }
            override fun afterTextChanged(p0: Editable?) {
            }
        })

        var c = Calendar.getInstance()
        val ed3 =findViewById<EditText>(R.id.ed3)
        ed3.setOnClickListener {

            DatePickerDialog(this, DatePickerDialog.OnDateSetListener { datePicker, i, i2, i3 ->
                val date= ed3.setText("$i3/${i2 + 1}/$i")
            }, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)).show()

        }


        val rdGroup = findViewById<RadioGroup>(R.id.radioGroup)
        //SubmitButton
        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            val bundle =Bundle()
            val selectbtn: Int = rdGroup.checkedRadioButtonId
            val b1 = findViewById<RadioButton>(selectbtn)
            val str ="${b1.text}"

            bundle.putString("Name",ed1.text.toString())
            bundle.putString("Email",ed2.text.toString())
            bundle.putString("Date",ed3.text.toString())
            bundle.putString("Radio",str.toString())
            bundle.putString("Start","Ajmer")
            bundle.putString("Destination","Bareilly")
            bundle.putString("Checkbox","Policy is Accepted")

            val intent = Intent(this,Form2::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }


    }
}