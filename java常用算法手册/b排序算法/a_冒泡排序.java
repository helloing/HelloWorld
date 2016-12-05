package com.java常用算法手册.b排序算法;

import com.arithmetic.util.Log;

import java.util.Arrays;

/**
 * Created by malei on 2016/12/4.
 * 冒泡排序：通过相邻的两个数据进行比较，然后排序  O(n^2)
 * 1)依次比较相邻的两个元素的大小
 * 2）如果前面的数据大，就交换。经过一轮多次的比较，便可将最大的数找到位置
 * 3）然后进行n-1轮
 */
public class a_冒泡排序 {

    public static void main(String[] args){
        int[] arr = {190,234,45,78,100};
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        int length = arr.length;
        int temp=0;
        for(int i = 1; i < length; i++){
            for (int j = 0; j < length - i; j++){ //每一次都可以确定最大的值
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            Log.show("第"+i+"次："+Arrays.toString(arr));
        }
        Log.show(Arrays.toString(arr));
    }
}
