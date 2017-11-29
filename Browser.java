package com.karthi.w3go;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Browser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        WebView webView= (WebView)findViewById(R.id.webView);
//findViewById returns an instance of View ,which is casted to target class
        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setJavaScriptEnabled(true);
//This statement is used to enable the execution of JavaScript.

        webView.setVerticalScrollBarEnabled(false);
//This statement hides the Vertical scroll bar and does not remove it.

        webView.setHorizontalScrollBarEnabled(false);
//This statement hides the Horizontal scroll bar and does not remove it.

        webView.loadUrl("https://www.google.co.in/");
//This statement hides the scroll bar and does not remove it.
      /*  ImageView facebook=(ImageView) findViewById(R.id.facebook);
        ImageView amazon = (ImageView) findViewById(R.id.amazon);
        ImageView instagram = (ImageView) findViewById(R.id.instagram);
        ImageView youtube = (ImageView) findViewById(R.id.youtube);
        ImageView flipkart = (ImageView) findViewById(R.id.flipkart);
        ImageView twitter = (ImageView) findViewById(R.id.twitter);
        ImageView googleP= (ImageView) findViewById(R.id.googleP);*/
    }
}
