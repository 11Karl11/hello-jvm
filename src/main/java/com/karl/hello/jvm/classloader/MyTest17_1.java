package com.karl.hello.jvm.classloader;

/**
 *
 * 关于命名空间的重要说明
 *
 * 子加载器所加载的类,能够访问父加载器所加载的类
 * 父加载器所加载的类,不能访问子加载器所加载的类
 *
 * @author karl xie
 */
public class MyTest17_1 {

    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");
        loader1.setPath("C:\\Users\\akang\\Desktop\\demo\\");
        Class<?> clazz = loader1.loadClass("com.karl.hello.jvm.classloader.MySample");
        System.out.println("class: " + clazz.hashCode());

        //如果注释掉改行,并不会实例化MySample对象,即MySample构造方法不会被执行,
        //因此不会实例化MyCat对象,没有对MyCat的主动使用,这里就不会加MyCat class
        Object object = clazz.newInstance();

    }
}