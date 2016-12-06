package com.java设计模式.c_行为型.b_策略模式;

import com.arithmetic.util.Log;

/**
 * Created by malei on 2016/12/6.
 */
public class Computer {

    private final Calculate calculate;

    public Computer(Calculate calculate){
        this.calculate = calculate;
    }

    public int exe(int a, int b){
        return calculate.operate(a,b);
    }

    public static void main(String[] args){
        Computer add = new Computer(new AddOperate());
        Computer sub = new Computer(new SubtraOperate());
        Log.show(add.exe(1,1));
        Log.show(sub.exe(1,1));
    }
}
