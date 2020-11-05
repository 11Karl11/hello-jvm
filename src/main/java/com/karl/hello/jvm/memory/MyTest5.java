package com.karl.hello.jvm.memory;

/**
 *
 * jcmd(从jdk1.7开始增加的命令)
 * jcmd pid VM.flags: 查看jvm启动参数
 * jcmd pid help: 列出当前运行的java进程可以执行的操作
 * jcmd pid JFR.dump: 查看具体命令的选项有哪些
 * jcmd pid PerfCounter.print: 查看jvm性能相关的参数
 * jcmd pid  VM.uptime : 查看jvm的启动时长
 * jcmd pid GC.class_histogram: 查看系统中的类的统计信息
 * jcmd pid Thread.print: 查看系统中线程信息
 * jcmd pid  GC.heap_dump fileName: 导出heap dump文件,可以用jvisualvm查看
 * jcmd pid  VM.system_properties: 查看jvm的属性信息
 * jcmd pid VM.version: 查看jvm进程的版本信息
 * jcmd pid VM.command_line: 查看jvm启动的命令行参数信息
 *
 *
 * jstack: 可以查看或者导出java应用程序中线程的堆栈信息
 * jstack pid
 *
 * jmc: java mission control
 * jfr: java flight recorder
 *
 * jhat: ava Heap Analysis
 *
 *
 * @author karl xie
 */
public class MyTest5 {

    public static void main(String[] args) {

        for (; ; ) {
            System.out.println("hello world");
        }
    }

}