package com.lifeistech.naoto.myapplication_app_contest;

import android.content.DialogInterface;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SetUpActivity extends AppCompatActivity {

    //問題を登録するActivity
    String group_name;
    TextView title;
    ListviewSetUp adapter;
    ListView listView;
    Words_sugar_orm words_sugar_orm[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_up);
        Intent intent = getIntent();
        group_name = intent.getStringExtra("group_name");
        //グループの名前を受け取っている
        title = (TextView)findViewById(R.id.textView2);
        //グループの名前をだすtextviewを登録した
        title.setText(group_name);
        listView = (ListView)findViewById(R.id.listView);
        adapter = new ListviewSetUp(this, R.layout.listview_set_up);
        listView.setAdapter(adapter);
    }
    public void dialog_set_up(View view){
        // 登録するためのダイアログへの受け渡し
        showDialog_set_up();
    }

    public void showDialog_set_up(){
        //登録するためのダイアログを作る
        final EditText japanese_editText = new EditText(this);
        final EditText english_edttText = new EditText(this);
        //登録のためのedittextを作る
        TextView japanese_textView = new TextView(this);
        japanese_textView.setText("和訳");
        TextView english_textView = new TextView(this);
        english_textView.setText("スペル");
        //登録の説明のためのtextViewを作る
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("単語を登録する");
        linearLayout.addView(japanese_textView);
        linearLayout.addView(japanese_editText);
        linearLayout.addView(english_textView);
        linearLayout.addView(english_edttText);
        builder.setView(linearLayout);
        builder.setNeutralButton("キャンセル", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.setPositiveButton("決定", new DialogInterface.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //単語を登録する時の処理1
                String japanese_string = japanese_editText.getText().toString();
                String english_string = english_edttText.getText().toString();
                if(japanese_string == null){
                    make_Toast("和訳が書かれていません");
                } else if(english_edttText == null){
                    make_Toast("スペルが書かれていません");
                }else{
                    Calendar calendar = Calendar.getInstance();
                    final int year = calendar.get(Calendar.YEAR);
                    String year_string = Integer.toString(year);
                    final int month = calendar.get(Calendar.MONTH);
                    String month_string = Integer.toString(month);
                    final int day = calendar.get(Calendar.DAY_OF_MONTH);
                    String day_string = Integer.toString(day);
                    StringBuffer buf = new StringBuffer();
                    buf.append(year_string);
                    buf.append(month_string);
                    buf.append(day_string);
                    //後はその日のなんばんめに登録したかを付け加えるだけ
                    Two_words two_words = new Two_words(group_name, japanese_string, english_string);
                    //two_words.save();
                    adapter.add(two_words);
                }

            }
        });
        builder.show();
    }

    public void finish(View view){
        //グループ自体、登録ができた時の処理
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("登録");
        builder.setMessage("登録していいですか？");
        builder.setNeutralButton("キャンセル", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //キャンセルする時の処理
                dialogInterface.dismiss();
            }
        });
        builder.setPositiveButton("登録", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //登録する時の処理
                Intent intent = new Intent(SetUpActivity.this,ListActivity.class);
                startActivity(intent);
            }
        });
    }

    public void make_Toast(String massage){
        Toast.makeText(this,massage,Toast.LENGTH_SHORT).show();
    }
}
