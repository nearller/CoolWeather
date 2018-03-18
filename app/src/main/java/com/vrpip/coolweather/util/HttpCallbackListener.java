package com.vrpip.coolweather.util;

/**
 * Created by Administrator on 2018-03-18.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
