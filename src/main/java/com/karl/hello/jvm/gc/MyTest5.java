package com.karl.hello.jvm.gc;

/**
 * -verbose:gc
 * -Xms20M
 * -Xmx20M
 * -Xmn10M
 * -XX:+PrintGCDetails
 * -XX:SurvivorRatio=8
 * -XX:+UseConcMarkSweepGC
 * @author karl xie
 */
public class MyTest5 {

    public static void main(String[] args) {

        int size = 1024 * 1024;


        byte[] myAlloc1 = new byte[4 * size];
        System.out.println("111111111111111");

        byte[] myAlloc2 = new byte[4 * size];
        System.out.println("2222222222222");

        byte[] myAlloc3 = new byte[4 * size];
        System.out.println("3333333333333");

        byte[] myAlloc4 = new byte[2 * size];
        System.out.println("44444444444");

    }
}