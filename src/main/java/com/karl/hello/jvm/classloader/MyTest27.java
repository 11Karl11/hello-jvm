package com.karl.hello.jvm.classloader;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author karl xie
 */
public class MyTest27 {

    public static void main(String[] args) throws Exception {
        //System.out.println(System.getProperty("jdbc.drivers"));
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn =
                DriverManager.getConnection("jdbc:mysql//localhost:3306/test", "username", "password");
    }

}