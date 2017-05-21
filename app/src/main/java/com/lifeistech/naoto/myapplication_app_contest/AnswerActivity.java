package com.lifeistech.naoto.myapplication_app_contest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AnswerActivity extends AppCompatActivity {

    //問題の答を表示するActivity
    int test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        Intent intent = getIntent();
        test = intent.getIntExtra("test",0)-1;

    }
    public void know (View view){
        //わかっていた時の処理
        Intent intent = new Intent(AnswerActivity.this, SolveActivity.class);
        intent.putExtra("test",test);
        if(test==0){
            Intent intent1 = new Intent(AnswerActivity.this,QuestionEndActivity.class);
            startActivity(intent1);
        }else{
            startActivity(intent);
        }
    }

    public void dont_know(View view){
        //わからなかった時の処理
        Intent intent = new Intent(AnswerActivity.this, SolveActivity.class);
        intent.putExtra("test",test);
        if(test==0){
            Intent intent1 = new Intent(AnswerActivity.this,QuestionEndActivity.class);
            startActivity(intent1);
        }else{
            startActivity(intent);
        }

    }
}
