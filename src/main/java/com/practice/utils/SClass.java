package com.practice.utils;

/**
 * CreatedBy cx
 * CreateTime 2018/7/4 17:30
 * Description
 */
public class SClass extends SSClass{
    static {
        System.out.println("This is static block of SClass");
    }
    public static int value = 123;
    public SClass(){
        System.out.println("init SClass");
    }
}
