package com.bytecode.www;
/*
   方法的静态分派：
   Grandpa g1 = new Father();
   以上代码:g1的静态类型 Grandpa，而g1的实际类型（真正指向的类型）是Father.
   我们可以得到这样一个结论：变量的静态类型是不会发生变化的。而变量的实际类型则
   是可以发生变化的（多态的一种体现）。实际类型是在运行期间方可确定。
 */
public class MyTest5 {
    /*
    方法的重载，对于JVM来说，是一种静态的行为,编译期间就可以确定了
    对于g1,g2来说，他们的静态行为是 Grandpa,
    所以会调用参数是 Grandpa 类型的方法
     */
    public void test(Grandpa grandpa){
        System.out.println("grandpa");
    }
    public void test(Father father){
        System.out.println("father");
    }
    public void test(Son son){
        System.out.println("son");
    }

    public static void main(String[] args) {

        Grandpa g1 = new Father();
        Grandpa g2 = new Son();

        MyTest5 test5 = new MyTest5();
        test5.test(g1);
        test5.test(g2);
        /*
        输出结果：
         grandpa
         grandpa
         */
    }
}

class Grandpa {

}
class Father extends Grandpa {

}
class Son extends Father{

}