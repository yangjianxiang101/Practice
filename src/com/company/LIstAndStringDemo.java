package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LIstAndStringDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("B");
        list.add("Z");
        list.add("C");
        StringBuilder result=new StringBuilder();
        boolean flag=false;
        for (String string : list) {
            if (flag) {
                result.append(",");
            }else {
                flag=true;
            }
            result.append(string);
        }
        System.out.println(result.toString());
        String Media = null;
        List list2 = new ArrayList();
        if(!result.equals("") && result != null){
            List<String> list1 = Arrays.asList(result.toString().split(","));
            for(int j = 0; j<list1.size();j++){
                Media = list1.get(j);
                HashMap map = new HashMap();
                map.put("Media",Media);
                list2.add(map);
            }
            System.out.println("list2"+list2);
        }
    }
}
