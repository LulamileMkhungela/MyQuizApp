package com.businescard.lulams.myquizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class general_question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_question4);
    }

    public void onClickm(View view) {
        Intent intent = new Intent(general_question4.this, general_question5.class);
        startActivity(intent);
        MainActivity.score=MainActivity.score +1;
    }

    public void onClickcc(View view) {
        Intent intent = new Intent(general_question4.this, general_question5.class);
        startActivity(intent);
    }

    public void onClicko(View view) {
        Intent intent = new Intent(general_question4.this, general_question5.class);
        startActivity(intent);
    }
}
