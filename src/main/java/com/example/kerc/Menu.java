package com.example.kerc;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

public class Menu extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void button_read(View view){
        Intent intent = new Intent(Menu.this, g1.class);
        startActivity(intent);
    }

    public void button_list(View view) {
        Intent intent = new Intent(Menu.this, list.class);
        startActivity(intent);
    }

    public void button_titles(View view) {
        Intent intent = new Intent(Menu.this, titles.class);
        startActivity(intent);
    }
}

