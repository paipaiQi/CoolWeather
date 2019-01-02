package com.example.qd.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by QD on 2018/2/23.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient clite =new OkHttpClient();
        Request request =new   Request.Builder().url(address).build();
        clite.newCall(request).enqueue(callback);
    }
}
