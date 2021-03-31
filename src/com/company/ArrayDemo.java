package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayDemo {
    static <T> List<T> arrayToList(final T[] array){
        final List<T> l = new ArrayList<T>(array.length);
        for(final T s : array){
            l.add(s);
        }
        return l;
    }

    public static void main(String[] args) {
        Integer [] myArray = {1,2,3,4};
        System.out.println(arrayToList(myArray).getClass());

        //最简便的数组转转成arrayList的方法
        List list = new ArrayList<>(Arrays.asList("a","b","c"));
        System.out.println(list);

        //Collection.toArray()方法使用的坑&如何反转数组
        String [] str = new String[]{ "dog", "lazy", "a", "over", "jumps", "fox", "brown", "quick", "A"};

        List<String> list1 = Arrays.asList(str);
        Collections.reverse(list1);
        str = list1.toArray(new String[0]);//没有指定类型会报错
        System.out.println(str);
    }
}
