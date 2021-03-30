package com.company;

import java.util.Random;

/**
 * 编写一个程序，模拟扔硬币的结果
 */
public class YingBiDemo {
    public static void main(String[] args) {
        for (int i =0;i<10;i++){
            double s = Math.random();
            boolean t = false;
            if(s>0.5){
                System.out.println(t+"---正面");
            }else{
                System.out.println(!t+"-----反面");
            }
        }
    }
}
