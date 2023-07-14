package com.example.android_loves_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.github.barteksc.pdfviewer.PDFView

class chemkotlin6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chemkotlin6)

        var pdfView:PDFView =findViewById(R.id.pdfview)
        pdfView.fromAsset("surface_chem.pdf").load()

    }
}