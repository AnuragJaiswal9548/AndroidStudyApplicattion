package com.example.android_loves_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class chemkotlin16 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chemkotlin16)

        var pdfView: PDFView =findViewById(R.id.pdfview)
        pdfView.fromAsset("polymers.pdf").load()
    }
}