package com.java设计模式.c_行为型.d_迭代器模式;

/**
 * Created by malei on 2016/12/6.
 * 迭代器接口
 */
public interface Iterator <T>{
    T next();
    boolean hasNext();
}
