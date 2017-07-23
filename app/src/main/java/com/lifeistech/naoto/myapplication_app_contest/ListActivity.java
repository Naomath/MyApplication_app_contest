package com.lifeistech.naoto.myapplication_app_contest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.orm.SugarRecord;

public class ListActivity extends AppCompatActivity {

    //登録された単語のグループのリストを扱う

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView listView = new ListView(this);
       // ArrayAdapter<> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        SugarRecord.listAll(TwoWords.class);
        for(long i = 0;;i++){
            GroupTwoWords groupTwoWords = SugarRecord.findById(GroupTwoWords.class, i);

        }
    }

}