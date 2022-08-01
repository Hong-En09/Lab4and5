package com.example.lab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class TnCActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tn_cactivity)
        val webViewInC: WebView = findViewById(R.id.webViewInC)
        webViewInC.loadUrl("https://seekt.000webhost.com/")
    }
}