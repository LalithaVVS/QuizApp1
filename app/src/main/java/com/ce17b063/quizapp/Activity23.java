package com.ce17b063.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Activity23 extends AppCompatActivity {
    public int score =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_23);
    }
    public void onClick(View view){
        if (view.getId()==R.id.radioButton81){
            Toast.makeText(this,"Correct",Toast.LENGTH_SHORT).show();
            score = score + 1;}
        else
            Toast.makeText(this,"Incorrect",Toast.LENGTH_SHORT).show();
    }
    public void onClick2(View view){
        Intent intent = new Intent(getApplicationContext(),EndActivity.class);
        intent.putExtra("stuff",String.valueOf(score));
        startActivity(intent);
    }
    public void onClick3(View view){
        Intent intent = new Intent(getApplicationContext(),Activity24.class);
        intent.putExtra("stuff",String.valueOf(score));
        startActivity(intent);
    }
}
