package com.businescard.lulams.myquizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class education_question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_question1);

        MainActivity.category = "education";

    }

    public void onClickcps(View view)
    {
        Intent intent = new Intent( education_question1.this, education_question2.class);
        startActivity(intent);
    }
    public void onClickobe(View view)
    {
        Intent intent = new Intent( education_question1.this, education_question2.class);
        startActivity(intent);
    }
    public void onClickncs(View view)
    {
        Intent intent = new Intent( education_question1.this, education_question2.class);
        startActivity(intent);
    }


}
