package com.businescard.lulams.myquizapp1;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class education_question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_question3);
    }

    public void onClicksal(View view)
    {

        Intent intent = new Intent( education_question3.this, education_question4.class);
        startActivity(intent);
        MainActivity.score=MainActivity.score +1;
    }

    public void onClicksao(View view)
    {

        Intent intent = new Intent( education_question3.this, education_question4.class);
        startActivity(intent);
    }

    public void onClicksalt(View view)
    {

        Intent intent = new Intent( education_question3.this, education_question4.class);
        startActivity(intent);
    }
}
