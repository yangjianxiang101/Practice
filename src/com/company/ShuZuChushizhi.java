package com.company;

/**
 * 数组初始化
 */
public class ShuZuChushizhi {
    public static void main(String[] args) {
        int [] a1 = {1,2,3,4,5};
        int [] a2 ;
        a2 = a1;
        for (int i = 0;i<a2.length;i++){
            a2[i] = a2[i]+1;
            System.out.println("a2["+i+"]="+a2[i]);
            System.out.println("a1["+i+"]="+a1[i]);
        }
        for (int j = 0;j<a1.length;j++){
            System.out.println("a1["+j+"]="+a1[j]);
        }
    }
}
