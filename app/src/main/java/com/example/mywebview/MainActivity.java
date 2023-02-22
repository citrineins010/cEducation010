package com.example.mywebview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    WebView webView;
    EditText editText;
    Button button;

    @SuppressLint("MissingInflatedId,LintWarningName") // webView id 값을 가져와 찾지 못해 오류로 인해서 선언
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.urlText); // activity_main 에서 editText id 값을 가져 오기
        webView = findViewById(R.id.webView); // activity_main 에서 webView id 값을 가져 오기
        button = findViewById(R.id.search); // activity_main 에서 button id 값을 가져 오기

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = editText.getText().toString(); // editText url 값 가져 오기
                webView.getSettings().setJavaScriptEnabled(true); // 웹 페이지 자바스크립트 허용
                webView.loadUrl(url); // loadUrl 통해서 웹 페이지 접속
                webView.setWebChromeClient(new WebChromeClient()); // 크롬 통해서 웹 페이지 접속 시 권한 설정
//                webView.setWebViewClient(new WebViewClient(){
//                    @Override
//                    public void onPageStarted(WebView view, String url, Bitmap favicon) {
//                        view.loadUrl(url);
//                    }
//
//                    @Override
//                    public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                        view.loadUrl(url);
//                        return true;
//                    }
//                });
            }
        });
    }


}
