package com.karl.hello.jvm.classloader;

/**
 * @Description 常量在编译阶段会存入到调用这个
 * 常量的方法所在的类的常量池中.
 * 本质上,调用类并没有直接引到定义常量的类,因此并不会触发定义
 * 常量类的初始化
 * <p>
 * 注意:这里指的是将常量存放到MyTest2的常量池中,
 * 之后MyTest和MyParent2就没有任何关系了
 * 甚至,我们可以将MyParent2的class文件删除
 * <p>
 * <p>
 * 助记符:
 * ldc 表示int float 或是string 类型
 * 的常量值从常量池推至栈顶.
 *
 * bipush : 表示将单字节(-128,127)的常量值推送至栈顶
 *
 * sipush : 表示将一个短整形的常量值(-32768,32767)的常量值推送至栈顶
 *
 * iconst_1: 表示将int类型1推送至栈顶
 * iconst_2: 表示将int类型2推送至栈顶
 * iconst_3: 表示将int类型3推送至栈顶
 * iconst_4: 表示将int类型4推送至栈顶
 * iconst_5: 表示将int类型5推送至栈顶
 *
 *
 * @Date 2020/5/17 20:20
 * @Created karl xie
 */
public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(MyParent2.i);
    }
}

class MyParent2 {
    public final static String str = "hello world";
    public final static short s = 7;
    public final static int i = 1;

    static {
        System.out.println("MyParen2 static block");
    }
}
