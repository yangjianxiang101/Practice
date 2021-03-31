package com.company;

/**
 * 单例模式-->饱汉模式:类加载时完成初始化，创建出实例对象（不管用不用，先创建）。
 */
public class SingleDemo {
    //实例化对象放到静态代码块中，可提高执行效率，但是可能更占用空间
    private final static SingleDemo instence=new SingleDemo();
    private SingleDemo(){};//私有的构造函数

//获取方法
    public static SingleDemo getinstance(){
        return instence;
    };

}
