package com.java常用算法手册.a算法思想;

import com.arithmetic.util.Log;

/**
 * Created by malei on 2016/12/4.
 * 递推算法思想：根据已知结果和关系，求解。适合在有明显数学公式的情况下
 */
public class b_递推算法 {

    /**
     * 一对两个月大的兔子以后每一个都可以生一对小兔子，而一对新生的兔子出生两个月
     * 以后，才能生小兔子。也就是说1月份出生，3月份才可以产仔。没有兔子死亡的情况下，‘
     * 一年后共有多少只兔子？
     */
    public static void main(String[] args){
        int count = opreate(12);
        Log.show(count);
    }

    /**
     * 第一个月 ：1
     * 第二个月：1
     * 第三个月：2
     * 第四个月：3
     * 第五个月：5
     * 已知结果和关系：每个月都是前两个月的相加  f(n) = f(n-1)+f(n-2)
     */
    private static int  opreate(int count) {
        if(count <=2 ){
            return 1;
        }
        int total = 0;
        total = opreate(count-1)+opreate(count-2);
        return total;
    }
}
