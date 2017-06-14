package com.businescard.lulams.myquizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static int score;
    public static String category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void education(View view)
    {
        Intent intent = new Intent(this,education_question1.class);
        startActivity(intent);
    }

    public void exploration(View view)
    {
        Intent intent = new Intent(this,exploration_question1.class);
        startActivity(intent);
    }

    public void general(View view)
    {
        Intent intent = new Intent(this,general_question1.class);
        startActivity(intent);
    }
}

