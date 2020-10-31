package com.karl.hello.jvm.bytecode;

/**
 * javap -c  com.karl.hello.jvm.bytecode.MyTest1
 *
 * javap -verbose  com.karl.hello.jvm.bytecode.MyTest1 (展示详细的冗余信息)
 * @author karl xie
 */
public class MyTest1 {

    private int a=1;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public MyTest1(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        MyTest1 myTest1 = new MyTest1(1);
    }
}