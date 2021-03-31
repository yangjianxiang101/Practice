package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * 三元操作符
 */
public class SanYuanDemo {
    public static void main(String[] args) {
        /*double s  = Math.random();
        boolean t = true;
        if(s > 0.5)
            System.out.println(t);
        else
            System.out.println(!t);

        double j = Math.random();
        System.out.println(j);
        System.out.println(j<0.5 ? j*10 : j);*/
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0;i < n;i++){
            System.out.println(in.nextInt());
        }
    }
}
