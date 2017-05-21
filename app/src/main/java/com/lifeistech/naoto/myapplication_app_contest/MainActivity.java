package com.lifeistech.naoto.myapplication_app_contest;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void solve(View view){
        //今日の問題を解く処理
        showDialog_solve();
    }

    public void list(View view){
        //リストについて処理

    }

    public void set_up(){
        // 問題を登録する処理
       showDialog_set_up();
    }

    public void showDialog_solve(){
        //ダイアログを表示するメソッド
        //solveの時
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.dialog_title);
        builder.setMessage(R.string.message);
        builder.setNegativeButton(R.string.dialog_today, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //今日の問題を解く時の処理
                        Intent intent = new Intent(MainActivity.this, SolveActivity.class);
                        intent.putExtra("test",3);
                        startActivity(intent);
                        //これからは引数を加え、今日の問題か、間違えやすい問題かわかるようにする

                    }
                });
        builder.setPositiveButton(R.string.dialog_weak, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //間違えやすい問題を解く時の処理
                        Intent intent = new Intent(MainActivity.this, SolveActivity.class);
                        startActivity(intent);
                        //これからは引数を加え、今日の問題か、間違えやすい問題かわかるようにする

                    }
                });

        builder.setNeutralButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //キャンセルする時の処理
                        dialogInterface.dismiss();
                    }
                });

        builder.show();
    }
    public void showDialog_set_up(){
        // 登録のダイアログ
        final EditText editText = new EditText(MainActivity.this);
        //ダイアログで入力用のedittext
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Set Up");
        builder.setMessage("登録するグループの名前を何にしますか？");
        builder.setView(editText);
        builder.setNeutralButton("キャンセル", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //キャンセルの処理
                dialogInterface.dismiss();
            }
        });
        builder.setPositiveButton("決定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String title = editText.getText().toString();
                if(title.length()==0){
                    make_toast("グループの名前が登録されていません");
                }
            }
        });
    }

    public void make_toast(String title){
        Toast.makeText(this,title,Toast.LENGTH_SHORT).show();


    }
}
