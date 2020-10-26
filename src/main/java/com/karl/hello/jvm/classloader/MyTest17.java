package com.karl.hello.jvm.classloader;

/**
 * @author karl xie
 */
public class MyTest17 {
    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");

        Class<?> clazz = loader1.loadClass("com.karl.hello.jvm.classloader.MySample");
        System.out.println("class: "+clazz.hashCode());

        //如果注释掉改行,并不会实例化MySample对象,即MySample构造方法不会被执行,
        //因此不会实例化MyCat对象,没有对MyCat的主动使用,这里就不会加MyCat class
        //Object object = clazz.newInstance();

    }
}