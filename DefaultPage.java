package com.example.home.projectalarmrpi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by home on 1/4/18.
 */

public class DefaultPage extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.default_page);
    }

    public void defaultpage(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void cloudpage(View v){
        Intent i = new Intent(this,CloudPage.class);
        startActivity(i);
    }
}
