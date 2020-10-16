package com.karl.hello.jvm.classloader;

/**
 * @author karl xie
 * Created on 2020-10-13 19:08
 */
public class MyTest7 {

    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("java.lang.String");
        System.out.println(aClass.getClassLoader());
        Class<?> clazz = Class.forName("com.karl.hello.jvm.classloader.MyTest7");
        System.out.println(clazz.getClassLoader());
    }
}

class C {

}