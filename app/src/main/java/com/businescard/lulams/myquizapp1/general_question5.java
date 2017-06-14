package com.businescard.lulams.myquizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class general_question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_question5);
    }

    public void onClickk(View view) {
        Intent intent = new Intent(general_question5.this,score.class);
        startActivity(intent);
        MainActivity.score=MainActivity.score +1;
    }
    public void onClickq(View view) {
        Intent intent = new Intent(general_question5.this,score.class);
        startActivity(intent);
    }

    public void onClickl(View view) {
        Intent intent = new Intent(general_question5.this,score.class);
        startActivity(intent);
    }




}
