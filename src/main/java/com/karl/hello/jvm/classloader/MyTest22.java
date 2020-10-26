package com.karl.hello.jvm.classloader;

/**
 * 打jar包的时候要把com.karl.hello.jvm.classloader这些以文件夹的形式打到jar包里面
 * java -Djava.ext.dirs=./ com.karl.hello.jvm.classloader.MyTest22
 * @author karl xie
 */
public class MyTest22 {

    static {
        System.out.println("MyTest22 initializer");
    }

    public static void main(String[] args) {

        System.out.println(MyTest22.class.getClassLoader());

        System.out.println(MyTest1.class.getClassLoader());
    }
}