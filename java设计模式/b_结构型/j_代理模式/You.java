package com.java设计模式.b_结构型.j_代理模式;

import com.arithmetic.util.Log;
import com.java设计模式.b_结构型.j_代理模式.Lunch;

/**
 * Created by malei on 2016/12/6.
 */
public class You implements Lunch {

    @Override
    public void eat() {
        Log.show("我要吃小炒肝尖！");
    }
}
