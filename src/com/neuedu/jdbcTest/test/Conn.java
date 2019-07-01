package com.neuedu.jdbcTest.test;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {

//    private static final String url="jdbc:mysql://192.168.150.169:3306/jdbc?useUnicode=true&characterEncoding=utf8";
//    private static final String user="root";
//    private static final String password="root";
    public static final String URL="jdbc:mysql://127.0.0.1:3306/jdbc?useUnicode=true&characterEncoding=utf8";
    public static final String ROOT="root";
    public static final String PWD="root";

    static {
        try {
            new Driver();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getconnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL,ROOT,PWD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
