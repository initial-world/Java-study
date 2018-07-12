package com.Multithreading.BasicFunctions;

/**
 * CreatedBy cx
 * CreateTime 2018/6/27 14:57
 * Description
 */
public class YieldTest {
    public static void main(String[] args) throws InterruptedException {
        new MyThread("低级", 1).start();
        new MyThread("中级", 5).start();
        new MyThread("高级", 10).start();
    }
}
