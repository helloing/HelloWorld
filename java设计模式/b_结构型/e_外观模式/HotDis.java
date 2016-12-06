package com.java设计模式.b_结构型.e_外观模式;

import com.arithmetic.util.Log;

/**
 * Created by malei on 2016/12/6.
 */
public class HotDis implements Disease{
    @Override
    public void say() {
        Log.show("发烧了");
    }
}
