package com.karl.hello.jvm.bytecode;

/**
 * 方法的动态分派
 *
 * 方法的动态分派涉及到一个重要的概念:方法的接收者
 *
 * invokevirtual字节码指令的多态查找流程
 *
 * 比较方法重载和方法重写,我们可以得到结论
 * 方法重载是静态的,方法重写是动态的,是运行期行为
 *
 * @author karl xie
 */
public class MyTest6 {

    public static void main(String[] args) {
        Fruit apple = new Apple();

        Fruit orange = new Orange();

        apple.test();
        orange.test();

        apple = new Orange();
        apple.test();
    }

}

class Fruit {
    public void test() {
        System.out.println("Fruit");
    }
}

class Apple extends Fruit {
    @Override
    public void test() {
        System.out.println("Apple");
    }
}

class Orange extends Fruit {
    @Override
    public void test() {
        System.out.println("Orange");
    }
}