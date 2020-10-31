package com.karl.hello.jvm.bytecode;

/**
 * 栈帧(stack frame)
 * 栈帧是一种用于帮助虚拟机执行方法调用与方法执行的数据结构
 * <p>
 * 栈帧本身是一种数据结构,封装了方法的局部变量表,动态链接信息,方法返回地址以及操作数栈等信息
 * <p>
 * 符号引用,直接引用
 *
 * 有些符号引用是在类加载阶段或是第一次使用时就会转换为直接引用,这种转换叫做静态解析
 * 静态解析的四种情形:
 * 1.静态方法
 * 2.父类方法
 * 3.构造方法
 * 4.私有方法(无法被重写)
 *
 * 以上四类方法称为非虚方法,他们是类加载阶段就可以将符合引用转换为直接引用的.
 *
 * 补充:
 * 在java中虚方法是指在编译阶段和类加载阶段都不能确定方法的调用入口地址，在运行阶段才能确定的方法。在java中的非虚方法有三种:
 *
 *  1、由invokestatic指令调用的static方法，这种方法在编译时确定在运行时不会改变。
 *
 *  2、由invokespecial指令调用的方法，这些方法包括私有方法，实例构造方法和父类方法，这些方法也是在编译时已经确定，在运行时不会再改变的方法
 *
 *  3、由final关键字修饰的方法。虽然final方法是由invokevirtual指令进行调用的，但是final修饰的方法不能够进行在子类中进行覆盖，所有final修饰的方法是不能够在运行期进行动态改变的。在java语言规范中明确规定final方法就是非虚方法。
 *
 *
 * 另外一些符号引用则是在每次运行期转换为直接引用,这种转换叫做动态链接,这体现为java的多态
 * <p>
 * 1.invokeinterface: 调用接口中的方法,实际上是在运行期决定的,决定到底调用实现该接口的哪个对象的特定方法
 * <p>
 * 2.invokestatic: 调用静态方法
 * <p>
 * 3.invokespecial: 调用自己的私有方法,构造方法(<init>)以及父类的方法
 * <p>
 * 4.invokevirtual: 调用虚方法,运行期动态查找的过程
 * <p>
 * 5.invokedynamic: 动态调用方法
 *
 *
 *
 *
 * @author karl xie
 */
public class MyTest4 {

    public static void test() {
        System.out.println("test invoked");
    }

    public static void main(String[] args) {
        test();
    }


}