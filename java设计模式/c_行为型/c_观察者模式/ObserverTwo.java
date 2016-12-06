package com.java设计模式.c_行为型.c_观察者模式;

import com.arithmetic.util.Log;

/**
 * Created by malei on 2016/12/6.
 */
public class ObserverTwo implements Observer{
    @Override
    public void update(Subject subject, Object data) {
        Log.show("ObserverTwo得到了通知"+ ((String )data).toString());
    }
}
