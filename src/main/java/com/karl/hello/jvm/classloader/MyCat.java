package com.karl.hello.jvm.classloader;

/**
 * @author karl xie
 * Created on 2020-10-17 16:44
 */
public class MyCat {

    public MyCat(){
        System.out.println("MyCat is loaded by: "+this.getClass().getClassLoader());

        // System.out.println("from MyCat: "+MySample.class);
    }
}