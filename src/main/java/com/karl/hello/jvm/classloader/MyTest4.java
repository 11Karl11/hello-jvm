package com.karl.hello.jvm.classloader;

/**
 * 对于数组实例来说,其类型是由jvm在运行期动态生成的,表示为[Lcom.karl.hello.jvm.classloader.MyParent4
 * 动态生成的类型父类型是object
 *
 * 对于数组来说,javaDoc经常将构成数组的元素为component,实际上就是将数组降低一个维度后的类型
 *
 * anewarray:表示创建一个引用类型的数组,并将其压入栈顶
 *
 * newarray:表示创建一个指定的原始类型的数据,并将其压入栈顶
 * @author karl xie
 * Created on 2020-10-13 15:33
 */
public class MyTest4 {
    public static void main(String[] args) {
        // MyParent4 myParent4 = new MyParent4();
        // System.out.println(myParent4.getClass());
        MyParent4[] myParent4s = new MyParent4[1];
        System.out.println(myParent4s.getClass());
        System.out.println(myParent4s.getClass().getSuperclass());
        MyParent4[][] myParent4s1 = new MyParent4[1][2];
        System.out.println(myParent4s1.getClass());
        System.out.println("-----------------");

        int[] ints = new int[1];
        System.out.println(ints.getClass());
        System.out.println(ints.getClass().getSuperclass());

        char[] chars = new char[21];
        System.out.println(chars.getClass());

        boolean[] booleans = new boolean[1];
        System.out.println(booleans.getClass());
    }
}

class MyParent4 {
    static {
        System.out.println("MyParent4 static block");
    }
}