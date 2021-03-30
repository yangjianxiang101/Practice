package com.company;

import java.util.*;

/**
 * 线性表，实现两个线性表集合A和B的并集操作。就是把存在集合B但是不存在于集合A中的元素插入集合A中
 */
public class SuanFaDemo2 {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        A.add(0,1);
        A.add(1,2);
        A.add(2,3);

        List<Integer> B = new ArrayList<>();
        B.add(0,1);
        B.add(1,4);
        B.add(2,5);

        for(int i = 0; i<B.size(); i++){
            //如果A中包含某个B中的元素，则插入
            if(!A.contains(B.get(i))){
                A.add(i,B.get(i));
            }
        }
        Collections.sort(A);
        System.out.println(A);
        for(int a : A){
            System.out.println(a);
        }
    }
}
