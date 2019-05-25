package com.bytecode.www;

import java.util.Date;
/*
   针对于方法调用动态分派的过程：
   虚拟机会在类的方法区建立一个虚方法表的数据结构（virtual method table,vtable）
   针对于invokeinterface指令来说，虚拟机会建立一个叫做接口方法表的数据结构(interface method table,itable)

 */
public class MyTest7 {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();

        animal.test("hello");
        dog.test(new Date());
        /*
        输出结果：
        animal str
        dog date
         */
    }
}
class Animal {

    public void test(String str){
        System.out.println("animal str");
    }
    public void test(Date date){
        System.out.println("animal date");
    }
}
class Dog extends Animal {

    @Override
    public void test(Date date) {
        System.out.println("dog date");
    }

    @Override
    public void test(String str) {
        System.out.println("dog str");
    }

    public void metod (){

    }
}