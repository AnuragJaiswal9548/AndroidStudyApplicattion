package com.example.android_loves_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class chemkotlin17 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chemkotlin17)

        var pdfView: PDFView =findViewById(R.id.pdfview)
        pdfView.fromAsset("everyday.pdf").load()

    }
}