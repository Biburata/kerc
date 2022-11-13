package com.example.kerc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class g1s10 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g1s10);
    }

    public void forward(View view){
        Intent intent = new Intent(g1s10.this, g1s11.class);
        startActivity(intent);
    }

    public void back(View view){
        Intent intent = new Intent(g1s10.this, g1s9.class);
        startActivity(intent);
    }

    public void exit(View view){
        Intent intent = new Intent(g1s10.this, Menu.class);
        startActivity(intent);
    }
}