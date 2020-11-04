package com.karl.hello.jvm.memory;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * -XX:MaxMetaspaceSize=10m
 * 方法区产生内存溢出错误(java.lang.OutOfMemoryError: Metaspace)
 *
 * @author karl xie
 */
public class MyTest4 {

    public static void main(String[] args) {
        for (; ; ) {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(MyTest4.class);
            enhancer.setUseCache(false);
            enhancer.setCallback((MethodInterceptor) (obj, method, args1, proxy) ->
                    proxy.invokeSuper(obj, args1));
            System.out.println("hello world");
            enhancer.create();
        }

    }


}