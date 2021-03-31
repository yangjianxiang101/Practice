package com.company;

import java.math.BigDecimal;

/**
 * 基础算法例子
 */
public class SuanFaDemo {
    //用简便方法计算1+2+3+...+100的值
    public static void main(String[] args) {
        //计算所耗时间
        System.out.println("时间1----"+currentTimeMillis());
        System.out.println("时间2----"+currentTimeMillis1());
        //简单方法
        /*int n = 100; sum=0;
        sum = (1+n)*n/2;
        System.out.println(sum);*/
    }
    public static Long currentTimeMillis(){
        //一般方法
        long startTime = System.nanoTime();
        int sum = 0;
        for (int i = 1;i<=100000;i++){
            sum+=i;
        }
        System.out.println(sum);
        long endTime = System.nanoTime();
        return endTime-startTime;
    }

    public static Long currentTimeMillis1(){
        //简单方法
        Long startTime = System.nanoTime();
        int n = 100000;
        int sum = (1+n)*n/2;
        System.out.println(sum);
        long endTime = System.nanoTime();
        return endTime-startTime;
    }

}
