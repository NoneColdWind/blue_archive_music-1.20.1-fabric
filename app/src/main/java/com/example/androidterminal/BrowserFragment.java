package com.example.androidterminal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.fragment.app.Fragment;

public class BrowserFragment extends Fragment {

    private WebView webView;
    private EditText urlInput;
    private ImageButton goButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_browser, container, false);
        
        webView = view.findViewById(R.id.web_view);
        urlInput = view.findViewById(R.id.url_input);
        goButton = view.findViewById(R.id.go_button);
        
        // 配置WebView
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        
        // 加载默认网页
        webView.loadUrl("https://www.google.com");
        
        // 点击go按钮加载网页
        goButton.setOnClickListener(v -> {
            String url = urlInput.getText().toString();
            if (!url.startsWith("http://") && !url.startsWith("https://")) {
                url = "https://" + url;
            }
            webView.loadUrl(url);
        });
        
        return view;
    }
}
