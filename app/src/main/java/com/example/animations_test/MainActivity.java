package com.example.animations_test;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable logoanimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Animation rotation = AnimationUtils.loadAnimation(this, R.anim.rotation);
        rotation.setDuration(1000);

        Button button = (Button) findViewById(R.id.button);

        final ImageView imageview = (ImageView) findViewById(R.id.imageView);
        imageview.setBackgroundResource(R.drawable.trans);
        logoanimation = (AnimationDrawable) imageview.getBackground();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logoanimation.start();
                imageview.startAnimation(rotation);

            }
        });

    }

}



