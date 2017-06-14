package com.businescard.lulams.myquizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class education_question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_question4);
    }

    public void onClicknmb(View view) {

        Intent intent = new Intent(education_question4.this, education_question5.class);
        startActivity(intent);
        MainActivity.score=MainActivity.score +1;
    }

    public void onClickcmp(View view) {

        Intent intent = new Intent(education_question4.this, education_question5.class);
        startActivity(intent);
    }

    public void onClickmtd(View view) {

        Intent intent = new Intent(education_question4.this, education_question5.class);
        startActivity(intent);


    }

}


