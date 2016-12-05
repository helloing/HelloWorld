package com.java常用算法手册.a算法思想;

import com.arithmetic.util.Log;

/**
 * Created by malei on 2016/12/4.
 * 递归算法思想：在程序中不断重复调用自身来达到求解的目地。 如求阶乘问题
 */
public class c_递归算法 {

    /**
     * 求解从1到100相乘的结果
     * @param args
     */
    public static void main(String[] args){
        long count = opreate(12);
        Log.show(count+"");
    }

    /**
     * n! = 1*2*3*...n 因此通过阶乘公式：
     * n!= n*(n-1)!
     * 这里有个坑，阶乘的返回值可能具体超过int的范围
     */
    private static long opreate(int num) {
        if(num <= 1 ){
            return 1;
        }
        return num * opreate(num-1);
    }
}
