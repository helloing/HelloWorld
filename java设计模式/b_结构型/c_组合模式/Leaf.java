package com.java设计模式.b_结构型.c_组合模式;

/**
 * Created by malei on 2016/12/6.
 */
public class Leaf extends Root{

    private String name;

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr + "-" + name);
    }
}
