package com.Multithreading.BasicFunctions;

/**
 * CreatedBy cx
 * CreateTime 2018/6/27 14:45
 * Description
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName()+"线程第"+i+"次执行");

            //YieldTest
            if(i%5==0){
                Thread.yield();
            }
        }
    }

    public MyThread(){
    }

    public MyThread(String name, int pro) {
        // 设置线程的名称
        super(name);
        // 设置优先级
        this.setPriority(pro);
    }
}
