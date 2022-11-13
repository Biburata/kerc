package com.example.kerc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class g1s11 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g1s11);
    }

    public void forward(View view){
        Intent intent = new Intent(g1s11.this, g1s12.class);
        startActivity(intent);
    }

    public void back(View view){
        Intent intent = new Intent(g1s11.this, g1s10.class);
        startActivity(intent);
    }

    public void exit(View view){
        Intent intent = new Intent(g1s11.this, Menu.class);
        startActivity(intent);
    }
}