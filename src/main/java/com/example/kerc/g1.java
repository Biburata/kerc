package com.example.kerc;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import java.util.concurrent.TimeUnit;

public class g1 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g1);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(3);
                    Intent intent = new Intent(g1.this, g1s1.class);
                    startActivity(intent);
                } catch (Exception e) {
                }
            }
        }).start();
    }
}
