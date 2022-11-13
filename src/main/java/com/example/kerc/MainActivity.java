package com.example.kerc;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    private AnimationUtils AnimationUtils;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = findViewById(R.id.imageView);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.rotate);
        image.startAnimation(anim);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(5);
                    Intent intent = new Intent(MainActivity.this, Menu.class);
                    startActivity(intent);
                } catch (Exception e) {
                }
            }
        }).start();
    }

}