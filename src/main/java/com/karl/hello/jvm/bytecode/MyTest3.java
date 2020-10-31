package com.karl.hello.jvm.bytecode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;

/**
 * 对于java类中的每个实例方法(非static方法)
 * 其在编译后所生成的字节码当中,方法参数的数量总是比源码中的方法参数的数量多一个(this)
 * 它位于方法参数的第一参数位置处
 * 这样,我们就可以在java的实例中使用this来访问当前对象的属性以及其他方法
 *
 * 这个操作是在编译期完成的,即由javac编译器在编译的时候将对this的访问转化为对一个普通实例方法参数的访问
 * 接下来在运行期间,由JVM在调用实例方法时,自动向实例方法传入this对象.
 * 所以实例方法的局部变量表中,至少会有一个指向当前对象的局部变量
 *
 *
 * java字节码对于异常的处理方式:
 *
 * 1.统一采用异常表的方式来对异常进行处理
 * 2.在jdk1.4.2之前的版本中,并不是使用异常表的方式来处理异常的,而是采用特定的指令方式
 *
 * 3.当异常处理存在finally语句块时,现代化的jvm采取的处理方式是将finally语句块的字节码拼接到
 * 每个catch块后面.
 *
 *
 * @author karl xie
 */
public class MyTest3 {

    public void test() throws IOException,Exception,NullPointerException {

        try {

            InputStream is = new FileInputStream("a.txt");

            ServerSocket serverSocket = new ServerSocket(9999);
            serverSocket.accept();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } catch (Exception e) {

        } finally {
            System.out.println("finally");
        }
    }
}