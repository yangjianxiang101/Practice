package com.company;

public class SubStringDemo {
    public static void main(String[] args) {
        String str = "0000sadadasdasd:-1".substring(4);
        String str1 = str.substring(0,str.indexOf(":"));
        System.out.printf(str1);
    }
}
