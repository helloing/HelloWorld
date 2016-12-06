package com.java设计模式.b_结构型.f_享元模式;

import com.arithmetic.util.Log;
import com.java设计模式.b_结构型.b_桥接模式.AbstractControl;

/**
 * Created by malei on 2016/12/6.
 */
public class Cat implements Animal{
    @Override
    public void run(int age) {
        Log.show("小猫"+age);
    }
}
