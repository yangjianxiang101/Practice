package com.company;

public class ContinueDemo {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        BubbleSort bs = new BubbleSort();
        bs.getA(a);
    }


    public void getA(int [] a){
        for (int i = 0;i < a.length; i++) {
            if(a[0]==1){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
