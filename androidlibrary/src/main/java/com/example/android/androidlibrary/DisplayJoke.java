package com.example.android.androidlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJoke extends AppCompatActivity {

    private TextView tvJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        tvJoke = findViewById(R.id.tv_joke);

        Intent intent = getIntent();
        String joke = intent.getStringExtra("GCE");
        tvJoke.setText(joke);
    }
}