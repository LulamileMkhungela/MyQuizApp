package com.businescard.lulams.myquizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class exploration_question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exploration_question5);
    }

    public void onClickdaaa(View view) {
        Intent intent = new Intent(exploration_question5.this, score.class);
        startActivity(intent);
    }

    public void onClickdaa(View view) {
        Intent intent = new Intent(exploration_question5.this, score.class);
        startActivity(intent);
        MainActivity.score=MainActivity.score +1;
    }

    public void onClickda(View view) {
        Intent intent = new Intent(exploration_question5.this, score.class);
        startActivity(intent);
    }
}
