package com.businescard.lulams.myquizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class education_question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_question5);
    }

    public void onClickfrd(View view) {

        Intent intent = new Intent(education_question5.this, score.class);
        startActivity(intent);
    }

    public void onClickhp(View view) {

        Intent intent = new Intent(education_question5.this, score.class);
        startActivity(intent);
    }

    public void onClicknwt(View view) {

        Intent intent = new Intent(education_question5.this, score.class);
        startActivity(intent);
        MainActivity.score=MainActivity.score +1;
    }
}
