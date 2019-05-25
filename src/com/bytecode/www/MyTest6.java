package com.bytecode.www;
/*
  方法的动态分派：
  方法的动态分派涉及到一个重要概念：方法接收者。
  invokevirtual字节码指令的多态查找流程
  1）：找到操作数栈顶的第一个元素（引用），它所指向对象的实际类型
  2）：如果在常量池中找到与方法描述符，和方法名称一样的情况下，并且访问权限也通过的话
  3) ：将符号引用转换为找到实例的直接引用，并调用
  4）：如果没有找到，则根据继承体系，从下往上找，直到找到，没有则抛出异常
  比较方法重载（overload）和方法重写（override），我们可以得到结论：
  方法重载是静态的，是编译期行为，方法重写是动态的，是运行期行为。
 */
public class MyTest6 {

    public static void main(String[] args) {

        Fruit apple = new Apple();
        Fruit orange = new Orange();

        apple.test();
        orange.test();

        apple = new Orange();
        apple.test();
        /*
        输出结果：
        apple
        orange
        orange
         */
    }
}

class Fruit {

    public void test(){
        System.out.println("fruit");
    }
}
class Apple extends Fruit {

    @Override
    public void test() {
        System.out.println("apple");
    }
}
class Orange extends Fruit {
    @Override
    public void test() {
        System.out.println("orange");
    }
}