package com.lifeistech.naoto.myapplication_app_contest;

import com.orm.SugarRecord;

/**
 * Created by naoto on 2017/06/04.
 */

public class Two_words extends SugarRecord {
    //一単語づつで管理する
    String title;
    //グループの名前
    String words_japanese;
    //wordの和訳
    String words_english;
    //wordのスペルの管理
    String date;
    //登録した日付の管理

    public Two_words(){
        //普通のコンストラクタ
        //使うことはない
    }

    public Two_words(String title, String words_japanese, String words_english, String date){
        this.title = title;
        this.words_japanese = words_japanese;
        this.words_english = words_english;
        this.date = date;
    }
}
