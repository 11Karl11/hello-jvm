package com.karl.hello.jvm.classloader;

import java.util.UUID;

/**
 * 当一个常量的值并非编译期间可以确认,那么值就不会放在调用类的常量池中
 * 这是在程序运行时,会导致主动使用这个类,类会被初始化
 * @author karl xie
 * Created on 2020-10-13 15:17
 */
public class MyTest3 {
    public static void main(String[] args) {
        System.out.println(MyParent3.str);
    }
}

class MyParent3 {
    public static final String str = UUID.randomUUID().toString();

    static {
        System.out.println("MyParent3 static code");
    }
}