package com.java设计模式.c_行为型.d_迭代器模式;

import com.arithmetic.bean.MyInstance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by malei on 2016/12/6.
 */
public class MyIterator<T> implements Iterator{

    private List<T> list = new ArrayList();
    private int cursor = 0;

    public  MyIterator(List<T> list){
        this.list = list;
    }

    @Override
    public T next() {
        T obj = null;
        if(this.hasNext()){
            obj = this.list.get(cursor++);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if(cursor == list.size()){
            return false;
        }
        return true;
    }
}
