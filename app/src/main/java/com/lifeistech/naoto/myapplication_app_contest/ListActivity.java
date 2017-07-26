package com.lifeistech.naoto.myapplication_app_contest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Adapter;
import android.widget.ListView;

import com.orm.SugarRecord;

public class ListActivity extends AppCompatActivity {

    //登録された単語のグループのリストを扱う
    ListView listView;
    ListSetUp adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        //ListViewの設定
        listView = (ListView)findViewById(R.id.listView2);
        adapter = new ListSetUp(this, R.layout.list_set_up);
        listView.setAdapter(adapter);
        //グループの名前の呼び出し
        SugarRecord.listAll(TwoWords.class);
        for(long i = 1;;i++){
            GroupTwoWords groupTwoWords = SugarRecord.findById(GroupTwoWords.class, i);
            if(groupTwoWords == null){
                break;
            }else {
                adapter.add(groupTwoWords);
            }
        }
    }

}