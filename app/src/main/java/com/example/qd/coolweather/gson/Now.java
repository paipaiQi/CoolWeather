package com.example.qd.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by QD on 2018/2/24.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
