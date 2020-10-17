package com.karl.hello.jvm.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author karl xie
 * Created on 2020-10-15 16:04
 */
public class MyTest16 extends ClassLoader {

    private String classLoadName;

    private String path;

    private final String fileExtension = ".class";

    public MyTest16(String classLoadName) {
        super();//默认父加载器是系统加载器
        this.classLoadName = classLoadName;

    }

    public MyTest16(ClassLoader parent, String classLoadName) {
        super(parent);//显示指定父加载器
        this.classLoadName = classLoadName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        System.out.println("findClass invoked: " + className);
        System.out.println("class loader name: " + classLoadName);
        byte[] data = this.loadClassData(className);
        return this.defineClass(className, data, 0, data.length);
    }

    private byte[] loadClassData(String className) {
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;
        className = className.replace(".", "/");
        try {
            is = new FileInputStream(new File(this.path + className + this.fileExtension));
            baos = new ByteArrayOutputStream();
            int ch;
            while (-1 != (ch = is.read())) {
                baos.write(ch);
            }
            data = baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                baos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");
        // loader1.setPath("E:\\learning\\other-learn-demo\\hello-jvm\\target\\classes");
        loader1.setPath("C:\\Users\\akang\\Desktop\\demo\\");

        Class<?> clazz = loader1.loadClass("com.karl.hello.jvm.classloader.MyTest1");
        System.out.println("class: " + clazz.hashCode());
        Object object = clazz.newInstance();
        System.out.println(object);
        System.out.println(object.getClass().getClassLoader());

        System.out.println("-------------------------");

        loader1 = null;
        clazz = null;
        object = null;
        System.gc();

        //可以用jvisualvm命令查看类卸载
        //Thread.sleep(2000000);

        loader1 = new MyTest16("loader1");
        loader1.setPath("C:\\Users\\akang\\Desktop\\demo\\");
        clazz = loader1.loadClass("com.karl.hello.jvm.classloader.MyTest1");
        System.out.println("class: " + clazz.hashCode());
        object = clazz.newInstance();

        //System.gc();

        System.out.println(object);
        System.out.println(object.getClass().getClassLoader());

        // MyTest16 loader2 = new MyTest16(loader1,"loader2");
        // loader2.setPath("C:\\Users\\akang\\Desktop\\demo\\");
        //
        // Class<?> clazz2 = loader2.loadClass("com.karl.hello.jvm.classloader.MyTest1");
        // System.out.println("class: "+clazz2.hashCode());
        // Object object2 = clazz2.newInstance();
        // System.out.println(object2);
        // System.out.println(object2.getClass().getClassLoader());
        //
        //
        // MyTest16 loader3 = new MyTest16(loader2,"loader3");
        // loader3.setPath("C:\\Users\\akang\\Desktop\\demo\\");
        //
        // Class<?> clazz3 = loader3.loadClass("com.karl.hello.jvm.classloader.MyTest1");
        // System.out.println("class: "+clazz3.hashCode());
        // Object object3 = clazz3.newInstance();
        // System.out.println(object3);
        // System.out.println(object2.getClass().getClassLoader());

    }

}