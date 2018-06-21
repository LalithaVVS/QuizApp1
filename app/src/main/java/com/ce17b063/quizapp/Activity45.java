package com.ce17b063.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Activity45 extends AppCompatActivity {
    public int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_45);
        String s = getIntent().getStringExtra("stuff");
        Log.d("FLAG", s);
        score = Integer.parseInt(s);
    }
    public void onClick(View view) {
        if (view.getId() == R.id.radioButton169) {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            score = score + 1;
        } else
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
    }

    public void onClick2(View view) {
        Intent intent = new Intent(getApplicationContext(), EndActivity.class);
        intent.putExtra("stuff", String.valueOf(score));
        startActivity(intent);
    }

    public void onClick3(View view) {
        Intent intent = new Intent(getApplicationContext(), Activity46.class);
        intent.putExtra("stuff", String.valueOf(score));
        startActivity(intent);
    }

    public void onClick4(View view) {
        Intent intent = new Intent(this, Activity44.class);
        intent.putExtra("stuff", String.valueOf(score));
        startActivity(intent);
    }

}
