package com.karl.hello.jvm.gc;

/**
 *
 * -verbose:gc 输出gc的详细信息
 * -Xms20M 初始堆大小
 * -Xmx20M 最大堆大小
 * -Xmn10M 新生代大小
 * -XX:+PrintGCDetails 输出详细信息
 * -XX:SurvivorRatio=8 eden:survivor1:survivor2 8:1:1
 * PSYoungGen: 8145K(新生代使用的空间)->984K(新生代清理后使用的空间)(9216K--新生代总容量  有1M是survivor空闲的)]
 * 8145K(堆上使用的总量)->6112K(19456K)
 *
 * @author karl xie
 */
public class MyTest1 {

    public static void main(String[] args) {
        int size = 1024 * 1024;


        byte[] myAlloc1 = new byte[2 * size];//里面都是0
        byte[] myAlloc2 = new byte[3 * size];
        byte[] myAlloc3 = new byte[2 * size];
        // byte[] myAlloc4 = new byte[2 * size];
        // byte[] myAlloc5 = new byte[2 * size];

        System.out.println("hello world");


    }
}