package com.bytecode.www;

public class MyTest2 {

    String str = "welcome";

    private int x = 5;

//    private Object object = new Object();

    public static Integer in = 10;

    public static void main(String[] args) {

        MyTest2 myTest2 = new MyTest2();

        myTest2.setX(10);

        in = 20;
    }
    /*
    对当前的对象上锁
     */
    private synchronized void setX(int x){
        this.x = x;
    }

    private void test(String str){

        synchronized (str){
            System.out.println("hello  world");
        }
    }
    /*
    synchronized static 对当前对象所对应的Class上锁
     */
    private static synchronized  void test2(){

    }
}
