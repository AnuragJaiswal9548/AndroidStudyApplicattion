package com.example.android_loves_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class bioclick6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bioclick6)

        val pdfView: PDFView =findViewById(R.id.pdfview)
        pdfView.fromAsset("mbi.pdf").load()
    }
}