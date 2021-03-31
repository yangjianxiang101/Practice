package com.company;

import java.util.Scanner;

/**
 * 斐波拉契数列（打印前40位斐波拉契数列）
 */
public class FeiBoLaQi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        fun(n);
    }
    private static void fun(int n) {
        int num[] = new int[n];
        num[0]=0;
        num[1]=1;
        System.out.println("num[0]----"+num[0]+" "+"\r\n"+"num[1]----"+num[1]);
        for(int i=2;i<n;i++){
            num[i] = num[i-1]+num[i-2];
            System.out.println("num"+"["+i+"]"+"----"+num[i]);
        }
    }
}
