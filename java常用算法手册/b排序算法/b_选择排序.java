package com.java常用算法手册.b排序算法;

import com.arithmetic.util.Log;

import java.util.Arrays;

/**
 * Created by malei on 2016/12/4.
 * 选择排序：每一步中选取最小值来从新排序  O(n^2)
 * 1）从数组中找到最小的数据，将其和第1个位置的数据交换
 * 2）接着从剩下的n-1个元素中选择次小的元素，将其和第2个位置的数据交换
 * 3）然后不断重复，执行n-1次
 */
public class b_选择排序 {
    public static void main(String[] args){
        int[] arr = {190,234,45,78,100};
        selectSort(arr);
    }

    private static void selectSort(int[] arr) {
        int length = arr.length;
        int temp=0;
        Log.show("原生数据："+ Arrays.toString(arr));
        for (int i = 0; i < length-1  ;i++){
            for (int j = i+1;j < length;j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
            Log.show("第"+i+"次："+Arrays.toString(arr));
        }
        Log.show(Arrays.toString(arr));
    }
}
