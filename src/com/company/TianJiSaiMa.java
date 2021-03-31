package com.company;

import java.util.*;

/**
 * 田忌赛马问题：
 * 如果3匹马变成1000匹，齐王仍然让他的马按从优到劣的顺序出赛，田忌可以按任意顺序选择他的赛马出赛。
 * 赢一局，田忌可以得到200两银子，输一局，田忌就要输掉200两银子，平局的话不输不赢。 请问田忌最多能赢多少银子?
 * 关于输入：
 *   输入包含多组测试数据,每组测试数据的第一行是一个整数n(1<=n<=1000),表示田忌和齐王都拥有n匹马。
 *   接下来一行是n个整数，表示田忌的马的速度，下一行也是n个整数，表示齐王的马的速度。 输入的最后以一个0表示结束。
 */
public class TianJiSaiMa {
    public static void main(String[] args) {
        int n, m;
        List<Integer>  list1=new ArrayList<Integer>();
        List<Integer>  list2=new ArrayList<Integer>();
        Scanner in=new Scanner(System.in);
        while(true){
            n=in.nextInt();
            if(n==0) break;

            //输入数据
            for(int i = 0; i < n; ++i)
            {
                list1.add(in.nextInt());
            }
            for(int i = 0; i < n; ++i)
            {
                list2.add(in.nextInt());
            }
            //处理数据
            Collections.sort(list1);
            Collections.sort(list2);

            int i=0, j=0, x=n-1, y=n-1,count=0;
            boolean bLast=true;

            while(bLast)
            {
                //是否是最后一匹马
                if(x==i)
                    bLast=false;

                if(list1.get(x) > list2.get(y))
                {//如果田忌当前最好的马可以胜齐王最好的马，那么比一场
                    x--;
                    y--;
                    count+=200;
                }
                else if(list1.get(i)> list2.get(j))
                {//如果田忌当前最差的马可以胜齐王最差的马，那么比一场
                    i++;
                    j++;
                    count += 200;
                }
                else
                {//否则，让田忌最差的马和齐王最好的好比一场
                    if(list1.get(i) < list2.get(y))
                        count -= 200;
                    i++;
                    y--;
                }
            }
            System.out.println(count);
            list1.clear();
            list2.clear();
        }

    }
}
