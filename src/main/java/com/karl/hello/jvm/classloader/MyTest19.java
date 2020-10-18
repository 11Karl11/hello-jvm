package com.karl.hello.jvm.classloader;

import com.sun.crypto.provider.AESKeyGenerator;

/**
 * @author karl xie
 * Created on 2020-10-18 10:40
 */
public class MyTest19 {

    public static void main(String[] args) {
        AESKeyGenerator aesKeyGenerator = new AESKeyGenerator();

        System.out.println(aesKeyGenerator.getClass().getClassLoader());
        System.out.println(MyTest19.class.getClassLoader());
    }
}