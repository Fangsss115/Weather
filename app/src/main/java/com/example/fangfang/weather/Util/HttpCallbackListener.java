package com.example.fangfang.weather.Util;

/**
 *
 */

public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
