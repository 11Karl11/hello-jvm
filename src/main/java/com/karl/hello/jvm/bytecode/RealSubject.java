package com.karl.hello.jvm.bytecode;

/**
 * @author karl xie
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("From real subject");
    }
}