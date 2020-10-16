package com.karl.hello.jvm.classloader;

/**
 * @author karl xie
 * Created on 2020-10-14 14:00
 */
public class MyTest13 {

    public static void main(String[] args) {
        ClassLoader loader = ClassLoader.getSystemClassLoader();

        System.out.println(loader);

        while (null != loader) {
            loader = loader.getParent();
            System.out.println(loader);
        }

    }
}