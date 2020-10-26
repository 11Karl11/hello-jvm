package com.karl.hello.jvm.classloader;

import java.util.Random;

/**
 * @author karl xie
 */



class FinalTest {
    public static final int x = new Random().nextInt(9);

    static {
        System.out.println("FinalTest static block");
    }
}

public class MyTest8 {
    public static void main(String[] args) {
        System.out.println(FinalTest.x);
    }

}