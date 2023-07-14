package com.example.android_loves_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class mthclick4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mthclick4)


        val pdfView: PDFView =findViewById(R.id.pdfview)
        pdfView.fromAsset("deter_minants.pdf").load()

    }
}