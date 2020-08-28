package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button gryffindor;
    Button slytherin;
    Button hufflepuff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gryffindor = (Button)findViewById(R.id.gryffindor);
        gryffindor.setOnClickListener(this);
        slytherin = (Button)findViewById(R.id.slytherin);
        slytherin.setOnClickListener(this);
        hufflepuff = (Button)findViewById(R.id.hufflepuff);
        hufflepuff.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.gryffindor:
                Intent gryffindor = new Intent(MainActivity.this, GryffindorActivity.class);
                startActivity(gryffindor);
                break;
            case R.id.slytherin:
                Intent slytherin = new Intent(MainActivity.this, SlytherinActivity.class);
                startActivity(slytherin);
                break;
            case R.id.hufflepuff:
                Intent hufflepuff = new Intent(MainActivity.this, HufflepuffActivity.class);
                startActivity(hufflepuff);
                break;
            default:
                break;
        }
    }
}