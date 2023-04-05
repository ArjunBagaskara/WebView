package com.arjunbagaskara_201103640.webview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button _tampilkanButton;
    private EditText _urlEditText;
    private WebView _webView1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _tampilkanButton = (Button) findViewById(R.id.tampilkanButton);
        _urlEditText = (EditText) findViewById(R.id.urLEditText);
        _webView1 = (WebView) findViewById(R.id.webView1);

    }

    public void tampilkanButton_onclick(View view) {
        String url = _urlEditText.getText().toString();
        _webView1.setWebViewClient(new WebViewClient());
        _webView1.loadUrl(url);
    }
}