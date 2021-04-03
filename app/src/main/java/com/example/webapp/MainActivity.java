package com.example.webapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

        private WebView mywebview;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mywebview =  (WebView) findViewById(R.id.webview);
            WebSettings webSettings = mywebview.getSettings();
            webSettings.setJavaScriptEnabled(true);
            mywebview.loadUrl("https://github.com/"); //Enter the URL of the Website you want to create the Mobile Application
            mywebview.setWebViewClient(new WebViewClient());
        }

        @Override
        public void onBackPressed() {
            if(mywebview.canGoBack()){
                mywebview.goBack();
            } else {
                super.onBackPressed();
            }
        }
}