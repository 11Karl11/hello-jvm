package com.karl.hello.jvm.classloader;

/**
 * @author karl xie
 * Created on 2020-10-18 10:33
 */
public class MyTest18_1 {

    public static void main(String[] args) throws ClassNotFoundException {
        MyTest16 loader1 = new MyTest16("loader1");
        loader1.setPath("C:\\Users\\akang\\Desktop\\demo\\");

        Class<?> clazz = loader1.loadClass("com.karl.hello.jvm.classloader.MyTest1");

        System.out.println("class: "+clazz.hashCode());
        System.out.println("class loader: "+clazz.getClassLoader());
    }
}