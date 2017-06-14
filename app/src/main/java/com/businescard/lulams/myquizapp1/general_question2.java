package com.businescard.lulams.myquizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class general_question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_question2);
    }

    public void onClick07(View view) {
        Intent intent = new Intent(general_question2.this, general_question3.class);
        startActivity(intent);
    }

    public void onClick10(View view) {
        Intent intent = new Intent(general_question2.this, general_question3.class);
        startActivity(intent);
        MainActivity.score=MainActivity.score +1;
    }

    public void onClick05(View view) {
        Intent intent = new Intent(general_question2.this,general_question3.class);
        startActivity(intent);
    }


}
