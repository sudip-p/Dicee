package com.sudip.dicee;

import android.media.Image;
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

        Button rollButton = findViewById(R.id.roll_button);

        final ImageView LEFTDICE = findViewById(R.id.image_leftDice);
        final ImageView RIGHTDICE = findViewById(R.id.image_rightDice);

        final int[] DICEARRAY = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Dicee","Button has been pressed!");

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(6);
//                int number_2 = randomNumberGenerator.nextInt(6);

                Log.d("Dicee","The random number is "+ number);

                LEFTDICE.setImageResource(DICEARRAY[number]);

                number = randomNumberGenerator.nextInt(6);

                RIGHTDICE.setImageResource(DICEARRAY[number]);
            }
        });



    }
}
