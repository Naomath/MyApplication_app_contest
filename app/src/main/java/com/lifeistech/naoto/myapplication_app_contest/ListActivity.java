package com.lifeistech.naoto.myapplication_app_contest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import com.orm.SugarRecord;

public class ListActivity extends AppCompatActivity {

    //登録された単語のグループのリストを扱う

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        SugarRecord.listAll(TwoWords.class);
        for(long i = 0;;i++){
            TwoWords twowords = SugarRecord.findById(TwoWords.class, i);

        }
    }

}