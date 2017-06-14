package com.businescard.lulams.myquizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class exploration_question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exploration_question4);
    }

    public void onClickbr(View view) {
        Intent intent = new Intent(exploration_question4.this, exploration_question5.class);
        startActivity(intent);
    }

    public void onClickgm(View view) {
        Intent intent = new Intent(exploration_question4.this, exploration_question5.class);
        startActivity(intent);
    }

    public void onClicksa(View view) {
        Intent intent = new Intent(exploration_question4.this, exploration_question5.class);
        startActivity(intent);
        MainActivity.score=MainActivity.score +1;
    }
}
