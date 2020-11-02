package com.karl.hello.jvm.bytecode;

import java.lang.reflect.Proxy;

/**
 *
 * ProxyGenerator 类中的generateProxyClass方法会对saveGeneratedFiles做校验,判断是否输出动态代理类的字节码
 *
 *
 * byte[] proxyClassFile = ProxyGenerator.generateProxyClass(Proxy类的639行)---生成字节码文件
 *
 * 壹. 为什么只能代理接口, 不能直接代理指定类
 * 在反编译了生成的动态代理类中看出, 继承了 Proxy 对象, 由于 Java 不支持多继承, 所以不能代理类
 * 贰. 为什么要重写 Object 类的三个方法
 * 这里假设一下, 如果动态代理类不重写 Object 的三个方法, 而 AddServiceImpl 重写了 Object 的 equals、toString 与 hashCode
 * 那么动态代理类调用的还是 Object 的三个方法, 就无法调用到被代理重写的方法
 * 叁. 为什么动态代理类要继承 Proxy
 * 没有找到很好的资料证明, 可能是为了判断一个类是否为动态代理类, 另外也节省了一些内存开销
 * 有明确答案和自己想法的可以通过留言区回复
 * 7.2 InvocationHandler
 * 壹. invoker 方法中第一个参数 Proxy 是什么
 * invoker 方法中 Proxy 就是生成的动态代理对象, 如果打印 proxy, 那么就是上文提到的 com.sun.proxy.$Proxy0
 * 同时也可以将 proxy 当作返回值返回进行连续调用, 这也是网上比较多的说法
 * 贰. method.invoke(proxy,args) 这么写有什么结果
 * 这是我在看动态代理时, 被绕着的一个点
 * 结果就是会循环调取 method 方法, 如果是 proxy 参数执行
 * 动态代理内部还是调用到自己本身, 最终导致死循环栈溢出
 *
 *
 * @author karl xie
 */
public class Client {

    public static void main(String[] args) {

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        RealSubject realSubject = new RealSubject();
        DynamicSubject dynamicSubject = new DynamicSubject(realSubject);
        Class<?> cls = realSubject.getClass();

        Subject subject = (Subject) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), dynamicSubject);
        subject.request();

        System.out.println(subject.getClass());
        System.out.println(subject.getClass().getSuperclass());
    }
}