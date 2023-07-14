package com.example.android_loves_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class bioclick12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bioclick12)

        val pdfView: PDFView =findViewById(R.id.pdfview)
        pdfView.fromAsset("bio_tech_app.pdf").load()
    }
}