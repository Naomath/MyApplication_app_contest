package com.lifeistech.naoto.myapplication_app_contest;

import com.orm.SugarRecord;

/**
 * Created by naoto on 2017/05/22.
 */

public class Words_sugar_orm extends SugarRecord {
    String title;
    //グループの名前
    String words_japanese[];
    //wordの和訳の管理の配列
    String words_english[];
    //wordのスペルの管理

    public Words_sugar_orm(){
        //普通のコンストラクタ
        //使うことはない
    }

    public Words_sugar_orm(String title, String words_japanese[], String words_english[]){
        this.title = title;
        this.words_japanese = words_japanese;
        this.words_english = words_english;
    }
}
