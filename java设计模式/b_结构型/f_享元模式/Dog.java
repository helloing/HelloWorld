package com.java设计模式.b_结构型.f_享元模式;

import com.arithmetic.util.Log;

/**
 * Created by malei on 2016/12/6.
 */
public class Dog implements Animal{
    @Override
    public void run(int age) {
        Log.show("小狗"+age);
    }
}
