package com.lifeistech.naoto.myapplication_app_contest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void solve(View view){
        //今日の問題を解く処理


    }

    public void list(View view){
        //リストについて処理

    }

    public void set_up(){
        // 問題を登録する処理

    }

    public void showDialog(){
        //ダイアログを表示するメソッド
        //"today"と関連している
        new AlertDialog.Builder(this)
        .setTitle(R.string.dialog_title)
        .setMessage(R.string.message)
                .setPositiveButton(R.string.dialog_today, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //今日の問題を解く時の処理

                    }
                })
                .setNegativeButton(R.string.dialog_weak, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //間違えやすい問題を解く時の処理

                    }
                })
                .setNeutralButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //キャンセルする時の処理

                    }
                })
        .show();
    }
}
