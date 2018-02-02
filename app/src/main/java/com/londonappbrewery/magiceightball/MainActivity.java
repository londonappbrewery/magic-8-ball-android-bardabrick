package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button AdviceButton;
        AdviceButton = (Button) findViewById(R.id.adviceButton);

        final ImageView askmelater = (ImageView) findViewById(R.id.image_ballAML);

        final int[] Ballarray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        AdviceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Magic Ball" , "The ball will now speak");

                Random randomballgenerator = new Random();

                int number = randomballgenerator.nextInt(5);

                Log.d("Magic ball" , "The ball is saying:" + number);

                askmelater.setImageResource(Ballarray[number]);


            }
        });


        }


    }

