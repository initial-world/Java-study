package com.Multithreading.BasicFunctions;

/**
 * CreatedBy cx
 * CreateTime 2018/6/27 14:47
 * Description 测试join方法
 */
public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        /**
         * 在主线程中调用thread.join(); 就是将主线程加入到thread子线程后面等待执行。
         */
        myThread.join();
        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName()+"线程第"+i+"次执行");
        }
    }
}
