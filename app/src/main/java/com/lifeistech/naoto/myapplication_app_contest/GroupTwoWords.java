package com.lifeistech.naoto.myapplication_app_contest;

import com.orm.SugarApp;
import com.orm.SugarRecord;

import java.util.ArrayList;

/**
 * Created by naoto on 2017/07/23.
 */

public class GroupTwoWords extends SugarRecord {
    private String GROUP_NAME;
    //グループの名前
    private long [] ids;
    // リストのフィールド

    public GroupTwoWords(){}
        //普通のコンストラクタ

    public GroupTwoWords(String GROUP_NAME, long [] ids){
        int size = ids.length;
        this.ids = new long[size];
        for(int i = 0; i < size;i++){
            this.ids[i] = ids[i];
        }
        this.GROUP_NAME = GROUP_NAME;
    }

    public String getGROUP_NAME(){return GROUP_NAME;}

    public long[] getIds(){return ids;}
}
