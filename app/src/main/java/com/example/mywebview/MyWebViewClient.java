package com.example.mywebview;



import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;



public class MyWebViewClient extends WebViewClient {

    @Override
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        error.getErrorCode();
        error.getDescription();
    }
}
