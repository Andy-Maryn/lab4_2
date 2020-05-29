package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentFour extends Fragment {

    public static FragmentFour newInstance() {
        
        Bundle args = new Bundle();
        
        FragmentFour fragment = new FragmentFour();
        fragment.setArguments(args);
        return fragment;
    }

    public FragmentFour() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fourth, container, false);
        WebView webView = (WebView) v.findViewById(R.id.web);
        webView.getSettings().setJavaScriptEnabled(true); // enable javascript
        webView.setWebViewClient(new WebViewClient()); // important to open url in your app
        webView.loadUrl("https://www.xda-developers.com/");
        return v;
    }
}
