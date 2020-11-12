package com.karl.hello.jvm.g1;

/**
 * -verbose:gc
 * -Xmx10m
 * -Xms10m
 * -XX:+UseG1GC
 * -XX:+PrintGCDetails
 * -XX:+PrintGCDateStamps
 * -XX:MaxGCPauseMillis=200m
 *
 * @author karl xie
 */
public class MyTest1 {
    public static void main(String[] args) {
        int size = 1024 * 1024;

        byte[] myAlloc1 = new byte[size];
        byte[] myAlloc2 = new byte[size];
        byte[] myAlloc3 = new byte[size];
        byte[] myAlloc4 = new byte[size];

        System.out.println("hello world");

    }
}