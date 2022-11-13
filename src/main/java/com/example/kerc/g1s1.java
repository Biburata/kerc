package com.example.kerc;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

public class g1s1 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g1s1);
    }

    public void forward(View view){
        Intent intent = new Intent(g1s1.this, g1s2.class);
        startActivity(intent);
    }

    public void back(View view){
        Intent intent = new Intent(g1s1.this, g1s1.class);
        startActivity(intent);
    }

    public void exit(View view){
        Intent intent = new Intent(g1s1.this, Menu.class);
        startActivity(intent);
    }
}