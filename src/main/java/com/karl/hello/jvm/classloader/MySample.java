package com.karl.hello.jvm.classloader;

import javax.sound.midi.Soundbank;

/**
 * @author karl xie
 */
public class MySample {

    public MySample(){
        System.out.println("MySample is loaded by: "+this.getClass().getClassLoader());

        new MyCat();

        System.out.println("from MySample:"+MyCat.class);
    }

    public static void main(String[] args) {
        MySample mySample = new MySample();
    }
}