package com.ce17b063.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    public String string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        string = getIntent().getStringExtra("stuff");

    }

    public void onClick1(View view) {
        if (string.equals("one")) {
            Intent intent = new Intent(this, Activity3.class);
            startActivity(intent);
        }
        if (string.equals("two")) {
            Intent intent = new Intent(this, Activity33.class);
            startActivity(intent);
        }
        if (string.equals("three")){
            Intent intent = new Intent(this,Activity63.class);
            startActivity(intent);
        }
    }

    public void onClick2(View view) {
        if (string.equals("one")) {
            Intent intent = new Intent(this, Activity13.class);
            startActivity(intent);
        }
        if (string.equals("two")) {
            Intent intent = new Intent(this, Activity43.class);
            startActivity(intent);
        }
        if (string.equals("three")) {
            Intent intent = new Intent(this, Activity73.class);
            startActivity(intent);
        }
    }

    public void onClick3(View view) {
        if (string.equals("one")) {
            Intent intent = new Intent(this, Activity23.class);
            startActivity(intent);
        }
        if (string.equals("two")) {
            Intent intent = new Intent(this, Activity53.class);
            startActivity(intent);
        }
    }
}
