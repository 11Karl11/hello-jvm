package com.karl.hello.jvm.classloader;

/**
 * @author karl xie
 * Created on 2020-10-18 10:45
 */
public class MyPerson {

    private MyPerson myPerson;

    public void setMyPerson(Object object) {
        this.myPerson = (MyPerson) object;
    }
}