package com.businescard.lulams.myquizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class exploration_question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exploration_question3);
    }

    public void onClick19(View view) {
        Intent intent = new Intent(exploration_question3.this, exploration_question4.class);
        startActivity(intent);
    }

    public void onClick18(View view) {
        Intent intent = new Intent(exploration_question3.this, exploration_question4.class);
        startActivity(intent);
        MainActivity.score=MainActivity.score +1;
    }

    public void onClick90(View view) {
        Intent intent = new Intent(exploration_question3.this, exploration_question4.class);
        startActivity(intent);
    }
}
