package com.example.foralex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import java.io.InputStream;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        WebView web= (WebView) findViewById(R.id.webview);
        web.getSettings().setAllowContentAccess(true);
        web.getSettings().setAllowFileAccess(true);;
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setDomStorageEnabled(true);

        web.getSettings().setDefaultTextEncodingName("utf-8");
        web.loadUrl("file:///android_asset/www/index.html");
    }
}
