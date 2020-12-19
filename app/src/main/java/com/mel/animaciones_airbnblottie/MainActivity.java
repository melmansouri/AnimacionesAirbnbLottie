package com.mel.animaciones_airbnblottie;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivity(View view) {
        //Ver fichero themes.xml
        ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(this);
        startActivity(new Intent(this,SecundarioActivity.class),options.toBundle());
    }
}