package com.neuedu.jdbcTest.test;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {

    private static final String url="jdbc:mysql://192.168.150.169:3306/jdbc?useUnicode=true&characterEncoding=utf8";
    private static final String user="root";
    private static final String password="1234";

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
            conn = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
