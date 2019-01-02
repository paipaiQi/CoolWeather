package com.example.qd.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by QD on 2018/2/24.
 */

public class Forecast {
    public String data;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public Now.More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info ;

    }
}
