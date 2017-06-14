package com.businescard.lulams.myquizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class exploration_question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exploration_question1);

        MainActivity.category = "exploration";
    }

    public void onClickjhb(View view) {
        Intent intent = new Intent(exploration_question1.this, exploration_question2.class);
        startActivity(intent);
        MainActivity.score=MainActivity.score +1;
    }

    public void onClickbfn(View view) {
        Intent intent = new Intent(exploration_question1.this, exploration_question2.class);
        startActivity(intent);
    }

    public void onClickdbn(View view) {
        Intent intent = new Intent(exploration_question1.this, exploration_question2.class);
        startActivity(intent);
    }

}
