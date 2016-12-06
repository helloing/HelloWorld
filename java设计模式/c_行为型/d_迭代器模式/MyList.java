package com.java设计模式.c_行为型.d_迭代器模式;

import com.arithmetic.util.Log;
import com.java设计模式.c_行为型.b_策略模式.Calculate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by malei on 2016/12/6.
 */
public class MyList<T> implements Collect<T>{

    private List list = new ArrayList();

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public Iterator iterator() {
        return new MyIterator(list);
    }

    public static void main(String[] args){
        Collect<String> list = new MyList<>();
        list.add("小米1");
        list.add("小米2");
        list.add("小米3");

        Iterator it = list.iterator();
        while (it.hasNext()){
            Log.show((String)it.next());
        }
    }
}
