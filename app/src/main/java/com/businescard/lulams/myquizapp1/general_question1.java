package com.businescard.lulams.myquizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class general_question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_question1);

        MainActivity.category = "general";
    }

    public void onClickj(View view) {
        Intent intent = new Intent(general_question1.this,general_question2.class);
        startActivity(intent);
        MainActivity.score=MainActivity.score +1;
    }

    public void onClickcpt(View view) {
        Intent intent = new Intent(general_question1.this, general_question2.class);
        startActivity(intent);
    }

    public void onClickdbn(View view) {
        Intent intent = new Intent(general_question1.this, general_question2.class);
        startActivity(intent);
    }


}
