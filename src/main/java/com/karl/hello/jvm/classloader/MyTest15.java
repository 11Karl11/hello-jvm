package com.karl.hello.jvm.classloader;

/**
 * @author karl xie
 */
public class MyTest15 {

    public static void main(String[] args) {
        String[] strings =new String[2];
        System.out.println(strings.getClass().getClassLoader());
        System.out.println("----------------");
        MyTest15[] myTest15s = new MyTest15[2];
        System.out.println(myTest15s.getClass().getClassLoader());
        System.out.println("-------");

        int[] ints = new int[2];
        System.out.println(ints.getClass().getClassLoader());
    }
}