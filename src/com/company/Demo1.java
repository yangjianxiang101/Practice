package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {

        String s1 ="fasdfbasjdfbjahsfhsabfsfsd";
        int length = 12;
       String seed = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random ran = new Random();
        StringBuffer buf = new StringBuffer();
        for(int i = 0;i<length ; i++){
            int num = ran.nextInt(seed.length());
            buf.append(seed.charAt(num));
        }
        System.out.println(s1+"_"+buf);
        System.out.println(buf.toString());

        Long ss = Long.parseLong(new SimpleDateFormat("yyMMddHHmmss").format(new Date()))+24 * 60 * 60L;
        System.out.println(ss);
    }
}
