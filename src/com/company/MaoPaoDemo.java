package com.company;

import java.util.Arrays;

//冒泡排序（从小到大）
public class MaoPaoDemo {
    public static void main(String[] args) {
        int [] a= {1,3,2,6,5,4};
        int temp = 0;
        for (int i = 0; i< a.length; i++){//第一个循环控制走多少遍
            for (int j = 0 ; j<a.length-i-1 ;j++){//第2个for循环控制每趟比较多少次
                if(a[j]>a[j+1]){ //大的往后面排
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));

        int[] intArray = new int[]{1,56,-5,33};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}
