package com.example.android_loves_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class phyclick2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phyclick2)


        val pdfView: PDFView =findViewById(R.id.pdfview)
        pdfView.fromAsset("c_e.pdf").load()

    }
}