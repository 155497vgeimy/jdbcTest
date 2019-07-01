package com.neuedu.jdbcTest.test;

import com.neuedu.jdbcTest.pojo.StudentManager;
import com.neuedu.jdbcTest.pojo.TeacherManager;
import com.neuedu.jdbcTest.uitl.Deletes;
import com.neuedu.jdbcTest.uitl.Inserts;
import com.neuedu.jdbcTest.uitl.Selects;
import com.neuedu.jdbcTest.uitl.Updates;

import java.sql.SQLException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws SQLException {

        System.out.println("*******欢迎登陆本学生管理系统*******");
        System.out.println("请选择功能:");
        System.out.println("1  查询学生信息");
        System.out.println("2  修改学生信息");
        System.out.println("3  添加学生信息");
        System.out.println("4  删除学生信息");
        System.out.println("5  退出系统");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input){
            case 1:
                new Selects().select();
                break;
            case 2:
                new Updates().update();
                break;
            case 3:
                new Inserts().insert();
                break;
            case 4:
                new Deletes().delete();
                break;
            case 5:
                System.out.println("******系统已退出******");
                break;
            default:
                break;
        }
    }
}
