package com.karl.hello.jvm.classloader;

/**
 * @Description 对于静态字段来说,只有直接定义了该字段的类才会被初始化
 * 当一个类初始化的时候,要求其父类都初始化完毕
 * -xx+TraceClassLoading ,用户追踪类的加载信息并打印出来
 * -XX:+<option> 表示开启option选项
 * -XX:-<option> 表示关闭option选项
 * -XX:<option>=<value> ,表示将option选项的值设置为value
 * @Date 2020/5/17 20:01
 * @Created karl xie
 */
public class MyTest1 {
    public static void main(String[] args) {
        System.out.println(MyChild1.str);
       // System.out.println(MyChild1.str2);
    }
}

class MyParent1{
    public static String str="hello world1";
    static {
        System.out.println("MyParent1 static block");
    }
}

class MyChild1 extends MyParent1{
    public static String str2="hello world2";
    static {
        System.out.println("MyChild1 static block");
    }

}




