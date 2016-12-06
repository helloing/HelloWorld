package com.java设计模式.c_行为型.j_中介者模式;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by malei on 2016/12/6.
 * ceo：中介者的具体实现类
 */
public class CEO implements Mediator{

    private Map<String, Department> map = new HashMap<String, Department>();

    @Override
    public void listener(String key, Department de) {
        map.put(key, de);
    }

    @Override
    public void say(String key) {
        map.get(key).action();
    }
}
