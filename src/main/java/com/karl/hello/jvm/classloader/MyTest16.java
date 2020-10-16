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

    private final String fileExtension = ".class";

    public MyTest16(String classLoadName) {
        super();//默认父加载器是系统加载器
        this.classLoadName = classLoadName;

    }

    public MyTest16(ClassLoader parent, String classLoadName) {
        super(parent);//显示指定父加载器
        this.classLoadName = classLoadName;
    }

    @Override
    public String toString() {
        return "MyTest16{" +
                "classLoadName='" + classLoadName + '\'' +
                '}';
    }

    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        byte[] data = this.loadClassData(className);
        return this.defineClass(className, data, 0, data.length);
    }

    private byte[] loadClassData(String name) {
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;
        try {
            this.classLoadName = this.classLoadName.replace(".", "/");
            is = new FileInputStream(new File(name + this.fileExtension));
            baos = new ByteArrayOutputStream();
            int ch = 0;
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
        test(loader1);
    }

    public static void test(ClassLoader classLoader) throws Exception {
        Class<?> clazz = classLoader.loadClass("com.karl.hello.jvm.classloader.MyTest1");
        Object object = clazz.newInstance();
        System.out.println(object);
    }
}