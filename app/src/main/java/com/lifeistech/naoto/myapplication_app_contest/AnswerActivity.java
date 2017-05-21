package com.lifeistech.naoto.myapplication_app_contest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AnswerActivity extends AppCompatActivity {

    //問題の答を表示するActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
    }
    public void know (View view){
        //わかっていた時の処理
        Intent intent = new Intent(AnswerActivity.this, SolveActivity.class);
        startActivity(intent);
    }

    public void dont_know(View view){
        //わからなかった時の処理
        Intent intent = new Intent(AnswerActivity.this, SolveActivity.class);
        startActivity(intent);
    }
}
