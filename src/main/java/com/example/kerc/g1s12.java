package com.example.kerc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class g1s12 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g1s12);
    }

    public void exit(View view){
        Intent intent = new Intent(g1s12.this, Menu.class);
        startActivity(intent);
    }
}