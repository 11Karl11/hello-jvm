package com.karl.hello.jvm.classloader;

/**
 * @author karl xie
 */
public class MyPerson {

    private MyPerson myPerson;

    public void setMyPerson(Object object) {
        this.myPerson = (MyPerson) object;
    }
}