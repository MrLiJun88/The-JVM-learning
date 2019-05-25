package com.DynamicProxy.www;

public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("from realSubject");
    }
}
