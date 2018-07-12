package com.practice.utils;

/**
 * CreatedBy cx
 * CreateTime 2018/7/4 17:32
 * Description
 */
public class CClass extends SClass {
    static
    {
        System.out.println("This is static block of CClass");
    }

    static int a;

    public CClass()
    {
        System.out.println("init CClass");
    }
}
