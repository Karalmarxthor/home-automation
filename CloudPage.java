package com.example.home.projectalarmrpi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by home on 1/4/18.
 */

public class CloudPage extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cloud_page);
    }

    public void turnoncloud(View v){
        try {
            WebView webView= (WebView)findViewById(R.id.web);
            webView.loadUrl("http://unsympathising-turb.000webhostapp.com/insert.php?pin=21&gpio=1");

        }catch (Exception e){
            Toast.makeText(this,"error"+e.getMessage(),Toast.LENGTH_SHORT).show();
        }

    }

    public void turnoffcloud(View v){
        try {
            WebView webView= (WebView)findViewById(R.id.web);
            webView.loadUrl("http://unsympathising-turb.000webhostapp.com/insert.php?pin=21&gpio=0");
        }catch (Exception e){
            Toast.makeText(this,"error"+e.getMessage(),Toast.LENGTH_SHORT).show();
        }


    }

    public void getstatuscloud(View v){
        try {
            WebView webView= (WebView)findViewById(R.id.web);
            webView.loadUrl("http://unsympathising-turb.000webhostapp.com/rpimessage.php");
        }catch (Exception e){
            Toast.makeText(this,"error"+e.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }
}
