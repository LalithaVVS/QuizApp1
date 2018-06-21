package com.ce17b063.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.widget.EditText;

public class EndActivity extends AppCompatActivity {
    public int score ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        String s = getIntent().getStringExtra("stuff");
        Log.d("FLAG", s);
        score = Integer.parseInt(s);
        EditText et = findViewById(R.id.textView16);
        et.setText(s);

    }
}
