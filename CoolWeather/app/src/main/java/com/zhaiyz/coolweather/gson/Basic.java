package com.zhaiyz.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhaiyz on 17-10-29.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
