package com.karl.hello.jvm.classloader;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * @author karl xie
 * Created on 2020-10-14 14:13
 */
public class MyTest14 {

    public static void main(String[] args) throws IOException {
        ClassLoader classLoader =Thread.currentThread().getContextClassLoader();

        String resourceName ="com/karl/hello/jvm/classloader/MyTest13.class";

        Enumeration<URL> urls =classLoader.getResources(resourceName);

        while (urls.hasMoreElements()){
            URL url = urls.nextElement();
            System.out.println(url);
        }

        System.out.println("------------------");

        Class<?> clazz = String.class;
        System.out.println(clazz.getClassLoader());


    }

}