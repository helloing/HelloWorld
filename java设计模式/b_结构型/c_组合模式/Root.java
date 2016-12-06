package com.java设计模式.b_结构型.c_组合模式;

/**
 * Created by malei on 2016/12/6.
 */
public abstract class Root {

    public void addLeaf(Root leaf){}
    public void removeLeaf(Root leaf){}

    public abstract void printStruct(String preStr);
}
