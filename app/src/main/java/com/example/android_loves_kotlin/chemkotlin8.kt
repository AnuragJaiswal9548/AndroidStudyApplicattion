package com.example.android_loves_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.github.barteksc.pdfviewer.PDFView

class chemkotlin8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chemkotlin8)

        var pdfView:PDFView =findViewById(R.id.pdfview)
        pdfView.fromAsset("p_block.pdf").load()

    }
}