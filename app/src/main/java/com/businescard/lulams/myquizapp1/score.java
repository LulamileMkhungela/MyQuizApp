package com.businescard.lulams.myquizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class score extends AppCompatActivity {
    private Button main;




    private int high = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        TextView tvScore = (TextView) findViewById(R.id.tvScore);


        double high = 5;
        double low = MainActivity.score;

        double divScore = low / high;
        final double tot = divScore * 100;

        tvScore.setText("Total Score = " + (int) tot + "%");

        main = (Button) findViewById(R.id.main);

        main.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                MainActivity.score = 0;
            }
        });




    }
    public void tryAgain(View view) {
        if (MainActivity.category == "education") {
            Intent intent = new Intent(getApplicationContext(), education_question1.class);
            startActivity(intent);
            MainActivity.score = 0;

        } else if (MainActivity.category == "exploration") {
            Intent intent = new Intent(getApplicationContext(), exploration_question1.class);
            startActivity(intent);
            MainActivity.score = 0;

        }
        else if (MainActivity.category == "general") {
            Intent intent = new Intent(getApplicationContext(), general_question1.class);
            startActivity(intent);
            MainActivity.score = 0;
        }



    }

}
