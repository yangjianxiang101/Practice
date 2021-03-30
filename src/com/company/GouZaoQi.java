package com.company;

class Bird {
    Bird(){}  //默认构造器，即无参构造器
    Bird(int i ){}

}

public class GouZaoQi{
    public static void main(String[] args) {
        System.out.println(Bird.class);
        Bird b = new Bird();
        Bird c = new Bird(10);

    }
}
