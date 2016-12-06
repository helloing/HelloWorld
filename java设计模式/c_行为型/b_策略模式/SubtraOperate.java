package com.java设计模式.c_行为型.b_策略模式;

/**
 * Created by malei on 2016/12/6.
 */
public class SubtraOperate implements Calculate{
    @Override
    public int operate(int a, int b) {
        return a-b;
    }
}
