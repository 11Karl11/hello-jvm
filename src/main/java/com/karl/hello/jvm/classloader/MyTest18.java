package com.karl.hello.jvm.classloader;

/**
 * 各种加载器所加载的目录
 *
 * 现需要将C:\workspace\Auto\target\cn目录下的文件打jar包
 *
 * 1.打开cmd,cd C:\workspace\Auto\target\cn\weather进入目录
 *
 * 2.输入命令: jar -cvf weather.jar *
 *
 * 3.进入C:\workspace\Auto\target\cn\weather目录下拷贝weather.jar
 * @author karl xie
 */
public class MyTest18 {

    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println("-----");
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));
    }
}