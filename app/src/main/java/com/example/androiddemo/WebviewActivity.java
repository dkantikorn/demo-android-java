package com.example.androiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

//        WebView wv = (WebView) findViewById(R.id.webview);
//        String customHtml = "<html>" +
//                "<body>" +
//                "<h1>Andriod Tutorial</h1>" +
//                "<h2>Andriod Tutorial</h2>" +
//                "<h3>Andriod Tutorial</h3>" +
//                "<p>It's a Static Web HTML Content.</p>" +
//                "</body>" +
//                "</html>";
//        wv.loadData(customHtml, "text/html", "UTF-8");


        WebView webview = (WebView) findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("http://www.google.com");
    }
}
