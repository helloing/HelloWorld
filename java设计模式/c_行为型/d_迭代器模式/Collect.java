package com.java设计模式.c_行为型.d_迭代器模式;

/**
 * Created by malei on 2016/12/6.
 * 集合的接口规范
 */
public interface Collect<T> {
    void add(T obj);
    void remove(T obj);
    Iterator iterator();
}
