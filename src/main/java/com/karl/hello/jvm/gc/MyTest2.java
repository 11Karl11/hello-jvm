package com.karl.hello.jvm.gc;

/**
 *
 * java  -XX:+PrintCommandLineFlags -version(查看jvm的默认参数)
 *
 * -XX:PretenureSizeThreshold(设置对象超过阈值直接在老年代分配)
 * -XX:+UseSerialGC
 * 两个指令要一起使用
 *
 *
 * @author karl xie
 */
public class MyTest2 {

    public static void main(String[] args) {
        int size = 1024 * 1024;

        byte[] myAlloc = new byte[5 * size];
        try {
            Thread.sleep(100000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}