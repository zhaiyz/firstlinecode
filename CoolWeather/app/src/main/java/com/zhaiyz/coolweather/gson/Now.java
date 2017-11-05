package com.zhaiyz.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhaiyz on 17-10-29.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
