package com.java设计模式.a_创建型.a_工厂模式;

import com.arithmetic.util.Log;

/**
 * Created by malei on 2016/12/5.
 * 实现规范的动物
 */
public class Dog implements Animal {
    @Override
    public void say() {
        Log.show("我是小狗");
    }
}
