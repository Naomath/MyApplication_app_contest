package com.lifeistech.naoto.myapplication_app_contest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SolveActivity extends AppCompatActivity {

    //問題を解く画面の提供
    int test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solove);
        Intent intent = getIntent();
        test = intent.getIntExtra("test",0);

    }

    public void go_to_answer(View view){
        // 答えの画面に行く処理
        Intent intent = new Intent(SolveActivity.this, AnswerActivity.class);
        intent.putExtra("test",test);
        startActivity(intent);

    }
}
