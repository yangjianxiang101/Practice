package com.company.streamApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * jdk1.8新特性之 Lambda表达式 、StreamApi
 */
public class Demo1 {
    public static void main(String[] args) {
        /*List<String> list1 = new ArrayList<>();
        list1.add("lily");
        list1.add("tom");
        list1.add("jack");
        list1.add("bi");
        list1.add("liy");
        list1.stream().filter(i -> i.length()>3).forEach(System.out :: println);

        Stream stream = Stream.of("a","b","c");

        String [] str = new String [] {"a","b","c"};
        stream = Stream.of(str);
        stream = Arrays.stream(str);


        //等价于
        // if(text != null) {
        // System.out.println(text);
        // }
        String text = "ss";
        Optional.ofNullable(text).ifPresent(System.out :: println);

        //reduce 的用例
        String contact = Stream.of("A","B","C","D").reduce("",(a,b) -> a+b);
        System.out.println(contact);

        // 求最小值，minValue = -3.0
        double minValue = Stream.of(-1.5, 1.0, -3.0, -2.0).reduce(Double.MIN_VALUE,Double::min);
        System.out.println(minValue);

        //数组求和
        Integer[] str3 = {1,2,3,4};
        Integer sumValue = Stream.of(str3).reduce(0,(a,b) -> a+b);
        Integer sumValue1 = Stream.of(str3).reduce(0, Integer::sum);
        System.out.println(sumValue);
        System.out.println(sumValue1);

        //遍历集合
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.stream().forEach(System.out :: println);*/

        //聚合流的值

        System.out.println("Creating list");
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            strings.add("Item " + i);
        }
        //串行流遍历输出stream()
        strings.stream().forEach(System.out :: println);

        //并行流遍历输出stream().parallel()
        strings.stream().parallel().forEach(System.out :: println);
        //统计元素个数
        //串行统计
        long count= strings.stream().count();
        System.out.println(count);

        //并行统计
        long count1 = strings.stream().parallel().count();
        System.out.println("count1----------"+count1);
    }   
}
