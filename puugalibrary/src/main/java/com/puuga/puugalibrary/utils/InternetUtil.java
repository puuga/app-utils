package com.puuga.puugalibrary.utils;

import android.content.Context;
import android.net.ConnectivityManager;

/**
 * Created by siwaweswongcharoen on 9/6/2016 AD.
 */
public class InternetUtil {
    public static boolean isInternetAvailable(Context context) {
        final ConnectivityManager connectivityManager = ((ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE));
        return connectivityManager.getActiveNetworkInfo() != null
                && connectivityManager.getActiveNetworkInfo().isConnected();
    }
}
