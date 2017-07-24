package com.lifeistech.naoto.myapplication_app_contest;

import com.orm.SugarApp;
import com.orm.SugarRecord;

import java.util.ArrayList;

/**
 * Created by naoto on 2017/07/23.
 */

public class GroupTwoWords extends SugarRecord {
    String GROUP_NAME;
    //グループの名前
    ArrayList LIST;
    // リストのフィールド
    public GroupTwoWords(){
        //普通のコンストラクタ

    }

    public GroupTwoWords(String GROUP_NAME, ArrayList LIST){
        this.GROUP_NAME = GROUP_NAME;
        this.LIST = LIST;
    }

    public String getGROUP_NAME(){

        return GROUP_NAME;
    }
}
