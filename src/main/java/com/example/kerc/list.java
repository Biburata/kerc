package com.example.kerc;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Toast;

public class list extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
    }

    public void button_g1(View view) {
        Intent intent = new Intent(list.this, g1.class);
        startActivity(intent);
    }

    public void button_quit(View view) {
        Intent intent = new Intent(list.this, Menu.class);
        startActivity(intent);
    }

    public void button_toast(View view){
        Toast.makeText(this, "В разработке", Toast.LENGTH_SHORT).show();
    }
}