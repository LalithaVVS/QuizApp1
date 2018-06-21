package com.ce17b063.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Activity1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
    }

    public void onClick1(View view) {
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("stuff", "one");
        startActivity(intent);
    }

    public void onClick2(View view) {
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("stuff", "two");
        startActivity(intent);
    }

    public void onClick3(View view) {
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("stuff", "three");
        startActivity(intent);
    }

    public void onClick4(View view) {
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("stuff", "four");
        startActivity(intent);
    }

    public void onClick5(View view) {
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("stuff", "five");
        startActivity(intent);
    }

    public void onClick6(View view) {
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("stuff", "six");
        startActivity(intent);
    }

    public void onClick7(View view) {
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("stuff", "seven");
        startActivity(intent);
    }

    public void onClick8(View view) {
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("stuff", "eight");
        startActivity(intent);
    }

    public void onClick9(View view) {
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("stuff", "nine");
        startActivity(intent);
    }
}
