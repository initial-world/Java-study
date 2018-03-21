package com;

import org.junit.Test;

/**
 * @CreatedBy cx
 * @CreatedTime 20180320
 * @description string stringbuffer stringbuilder 及 对象引用类型
 */
public class StringLearning {

    //Example1
    //基本数据类型时（基本数据类型包 括 byte,int,short,char,float,double以及boolean），传递的只是该数据内容的一个副本
    static void check(int a)
    {
        a++;
    }
    public static void main(String[]args)
    {
        int x=10;
        check(x);
        System.out.println("Example1.x="+x);
    }


    //Example2
    //对象型数据类型的一种。一个方法传递对象型数据类型（包括String, StringBuffer，类对象引用，接口引用和数组等）
    //传递的是该数据对象的某个引用变量（的副本）而不是对象内容本身
    static void check(StringBuffer obj)
    {
        obj.append("JAVA");
    }
    @Test
    public void test2()
    {
        StringBuffer x=new StringBuffer("Hello   ");
        check(x);
        System.out.println("Example2.x="+x);
    }

    //Example3
    //String类是final的，它的值一经创建就不可改变
    static void check(String obj)
    {
        obj="JAVA";
    }
    static void check1(String obj)
    {
        obj = obj.substring(2,3);
    }
    @Test
    public void test3()
    {
        String x="Hello   ";
        check(x);
        System.out.println("Example3.x="+x);
        check1(x);
        System.out.println("Example3.x="+x);
    }

    //Example4
    static void check(StringBuilder obj)
    {
        obj.append("JAVA");
    }
    @Test
    public void test4()
    {
        StringBuilder x=new StringBuilder("Hello   ");
        check(x);
        System.out.println("Example2.x="+x);
    }





}
