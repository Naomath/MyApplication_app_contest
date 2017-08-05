package com.lifeistech.naoto.myapplication_app_contest.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by HALU on 2017/08/05.
 */

public class Util {

    private Util(){
        // default コンストラクタ
    }

    public static void makeToast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
