package com.businescard.lulams.myquizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class exploration_question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exploration_question2);
    }

    public void onClickgm(View view) {
        Intent intent = new Intent(exploration_question2.this, exploration_question3.class);
        startActivity(intent);
    }

    public void onClickdm(View view) {
        Intent intent = new Intent(exploration_question2.this, exploration_question3.class);
        startActivity(intent);
        MainActivity.score=MainActivity.score +1;
    }

    public void onClickc(View view) {
        Intent intent = new Intent(exploration_question2.this, education_question3.class);
        startActivity(intent);
    }
}

