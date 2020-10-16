package com.karl.hello.jvm.classloader;

/**
 * 调用ClassLoader类的loadClass方法加载一个类,并不是对类的主动使用,不会导致类初始化
 * @author karl xie
 * Created on 2020-10-14 13:46
 */

class CL {
    static {
        System.out.println("Class CL");
    }
}

public class MyTest12 {
    public static void main(String[] args) throws Exception {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        Class<?> clazz = loader.loadClass("com.karl.hello.jvm.classloader.CL");
        System.out.println(clazz);

        System.out.println("--------------");
        clazz = Class.forName("com.karl.hello.jvm.classloader.CL");

        System.out.println(clazz);

    }
}