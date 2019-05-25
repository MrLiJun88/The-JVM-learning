package com.test.www;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        Set<Student> set = new TreeSet<>();
        set.add(new Student("Lucy",20));
        set.add(new Student("Hellen",21));
        set.add(new Student("Andrew",19));
        set.add(new Student("Krsitin",23));
        set.add(new Student("Arnold",36));

        Iterator<Student> iterable = set.iterator();

        while(iterable.hasNext()){
            Student student = iterable.next();
            System.out.println(student.getName() + " " + student.getAge());
        }
    }
}
