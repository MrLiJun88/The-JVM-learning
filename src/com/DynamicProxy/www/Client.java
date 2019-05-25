package com.DynamicProxy.www;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

        Subject subject = new RealSubject();

        DynamicSubject ds = new DynamicSubject(subject);

        Subject proxySubject = (Subject)Proxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),ds);

        proxySubject.request();

        System.out.println(subject.getClass());
        System.out.println(subject.getClass().getSuperclass());
        System.out.println(proxySubject.getClass());
        System.out.println(proxySubject.getClass().getSuperclass());

    }

}
