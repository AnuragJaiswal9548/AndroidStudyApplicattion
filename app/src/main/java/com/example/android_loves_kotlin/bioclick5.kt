package com.example.android_loves_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class bioclick5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bioclick5)

        val pdfView: PDFView =findViewById(R.id.pdfview)
        pdfView.fromAsset("PI_molec.pdf").load()
    }
}