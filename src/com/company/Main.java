package com.company;

import java.math.BigDecimal;
import java.util.*;

/**
 * Arrays.asList方法将数组转化成list
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        /*String[] str = new String[]{"apple","egg","pig"};
        List myList = Arrays.asList(str);
        //此处不能直接使用list的相关方法，因为它底层其实还是数组
        //myList.add("11111");
        str[0] = "22222";
        System.out.println(myList);
        System.out.printf(myList.get(0).toString());


        ArrayList ars = new ArrayList();

        LinkedList ls = new LinkedList();


        HashMap hs = new HashMap();


        String s = "null";
        BigDecimal v = new BigDecimal(s);
        System.out.println(v);*/


        List <Integer> str = new ArrayList<Integer>();
        /*str.add(0,"000");
        str.add(1,"111");
        str.add(2,"222");
        str.add(3,"333");*/
        for(int i = 0; i< 10;i++){
            str.add(i);
            if(!(str.get(i)==2)){
                continue;
            }
            System.out.println(str);
            System.out.println("ss");
            System.out.println("ssss");
        }

    }
}
