package com.lifeistech.naoto.myapplication_app_contest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListGroupWordsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_group_words);
        Intent intent = getIntent();
        long id = intent.getIntExtra("ID_GROUP_TWOWORDS",0);
        //受け渡し終了
        ListView listView = (ListView)findViewById(R.id.listview_LGW);
        ListGroupWordsListViewSetUp adapter = new ListGroupWordsListViewSetUp(this, R.layout.ListGroupWordsSetUp);
        listView.setAdapter(adapter);
        //listviewの設定終了
        GroupTwoWords groupTwoWords = GroupTwoWords.findById(GroupTwoWords.class,id);
        ArrayList <TwoWords> list = groupTwoWords.getList();
        for (int i = 0;;i++){
            TwoWords twoWords = list.get(i);
            if(twoWords == null){
                break;
            }else {
                adapter.add(twoWords);
            }
        }
    }
}
