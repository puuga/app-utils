package com.puuga.puugalibrary.utils;

import android.content.Context;

/**
 * Created by siwaweswongcharoen on 9/6/2016 AD.
 */
public class SingletonTemplate {
    private static SingletonTemplate instance;

    public static  SingletonTemplate getInstance() {
        if (instance == null)
            instance = new SingletonTemplate();
        return instance;
    }

    private Context mContext;

    private SingletonTemplate() {
        mContext = Contextor.getInstance().getContext();
    }
}
