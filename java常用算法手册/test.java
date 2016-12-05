package com.java常用算法手册;

import com.arithmetic.util.Log;
import org.junit.Test;

import java.util.Random;

/**
 * Created by malei on 2016/12/4.
 */
public class test {

    @Test
    public void test1(){
        Random random = new Random();
        for (int i =0 ; i<10 ; i++){
            Log.show(random.nextInt(2));
        }
    }
}
