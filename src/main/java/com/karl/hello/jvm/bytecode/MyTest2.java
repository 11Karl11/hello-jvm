package com.karl.hello.jvm.bytecode;

/**
 * javap -verbose -p(打印私有的方法等)  com.karl.hello.jvm.bytecode.MyTest1 (展示详细的冗余信息)
 *
 * @author karl xie
 */
public class MyTest2 {

    String str = "welcome";

    private int x = 5;

    public static Integer in = 10;


    public static void main(String[] args) {

        MyTest2 myTest2 = new MyTest2();
        myTest2.setX(8);
        in = 20;
    }

    private synchronized void setX(int x) {
        this.x = x;
    }

    private void test(String str) {
        synchronized (str) {
            System.out.println("hello world");
        }
    }

    //将MyTest2的Class对象上锁
    private static synchronized void test2() {

    }


}