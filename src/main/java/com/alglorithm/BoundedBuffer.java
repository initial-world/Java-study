package com.alglorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @CreatedBy cx
 * @CreateTime 2018/4/10 20:33
 * @description
 */
class BoundedBuffer {
    final Lock lock = new ReentrantLock();
    final Condition notEmpty = lock.newCondition();
    final Condition notFull = lock.newCondition();

    final int MAX_SIZE = 5;
    List<Object> list = new ArrayList<Object>();
    int count = 0;

    public void put(Object obj) throws InterruptedException {
        lock.lock();
        try {
            while (count == MAX_SIZE) {
                notFull.await();
            }
            list.add(obj);
            count++;
            System.out.println("call: notEmpty.signal()");
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public Object take() throws InterruptedException {
        lock.lock();
        try {
            while (count == 0) {
                notEmpty.await();
            }
            Object obj = list.remove(0);
            count --;
            System.out.println("call: notFull.signal()");
            notFull.signal();
            return obj;
        } finally {
            lock.unlock();
        }
    }


    
    public int cal(int a[]) {
        int temp=a[0]+a[1];
        int temp2=a[0]+a[1];
        for (int i = 0; i < a.length; i++) {
            temp = a[i]+a[i+1];

            if (temp>temp2){
                temp2=temp;
            }
        }
        return temp2;
    }



}