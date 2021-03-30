package com.company;

//饥汉模式:延迟加载，在第一次用的时候才创建出对象，存在线程安全问题。
public class SingleDemo2 {
    private  static SingleDemo2 instence=null;
    private SingleDemo2(){};//私有的构造函数
    //获取方法
    public static synchronized SingleDemo2 getinstance(){
        if(instence==null){
        //第一次使用的时候创建对象
            instence=new SingleDemo2();
        }
        return instence;
    };
}
