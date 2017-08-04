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
    private TwoWords [] twoWordses;
    // リストのフィールド
    int  size;

    public GroupTwoWords(){}
        //普通のコンストラクタ

    public GroupTwoWords(String GROUP_NAME, TwoWords [] twoWordses){
        this.GROUP_NAME = GROUP_NAME;
        size = twoWordses.length;
        this.twoWordses = new TwoWords[size];
        this.twoWordses = twoWordses;
    }

    public String getGROUP_NAME(){return GROUP_NAME;}

    public TwoWords[] getTwoWordses(){return twoWordses;}
}
