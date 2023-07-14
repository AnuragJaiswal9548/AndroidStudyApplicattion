package com.example.android_loves_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.github.barteksc.pdfviewer.PDFView

class chemkotlin10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chemkotlin10)

        var pdfView:PDFView =findViewById(R.id.pdfview)
        pdfView.fromAsset("co_ordinate_comp.pdf").load()

    }
}