package com.example.ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView image1, image2, image3, image4, image5, image6, image7, image8, image9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);
        image7 = findViewById(R.id.image7);
        image8 = findViewById(R.id.image8);
        image9 = findViewById(R.id.image9);

        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
        image5.setOnClickListener(this);
        image6.setOnClickListener(this);
        image7.setOnClickListener(this);
        image8.setOnClickListener(this);
        image9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int ViewId = v.getId();
        int[] images = {R.drawable.image1, R.drawable.image2, R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6,R.drawable.image7,R.drawable.image8,R.drawable.image9};
        switch (ViewId) {
            case R.id.image1:
                image1.setImageResource(images[(int) Math.floor(Math.random()*9)]);
                break;
            case R.id.image2:
                image2.setImageResource(images[(int) Math.floor(Math.random()*9)]);
                break;
            case R.id.image3:
                image3.setImageResource(images[(int) Math.floor(Math.random()*9)]);
                break;
            case R.id.image4:
                image4.setImageResource(images[(int) Math.floor(Math.random()*9)]);
                break;
            case R.id.image5:
                image5.setImageResource(images[(int) Math.floor(Math.random()*9)]);
                break;
            case R.id.image6:
                image6.setImageResource(images[(int) Math.floor(Math.random()*9)]);
                break;
            case R.id.image7:
                image7.setImageResource(images[(int) Math.floor(Math.random()*9)]);
                break;
            case R.id.image8:
                image8.setImageResource(images[(int) Math.floor(Math.random()*9)]);
                break;
            case R.id.image9:
                image9.setImageResource(images[(int) Math.floor(Math.random()*9)]);
                break;
        }

    }




}
