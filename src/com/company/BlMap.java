package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * 遍历map类型
 */
public class BlMap {
    //先建立一个map
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap();
        map.put(1,"中国");
        map.put(2,"美国");
        map.put(3,"英国");
        map.put(4,"法国");
        //双列集合：map等   ；  单列集合：list，set等
        //遍历思想：因为for each 无法遍历双列结构的集合，所以需要先把双列转换成单列的集合，如：set
        for (Map.Entry<Integer,String> temp: map.entrySet()) {
            //System.out.println(temp);
            //默认输出格式为  key=value
            //改成  key:value格式代码如下：
            System.out.println(temp.getKey()+":"+temp.getValue());

        }

    }

    public class SynchronizedDemo {
        public void method() {
            synchronized (this) {
                System.out.println("synchronized 代码块");
            }
        }
    }
}
