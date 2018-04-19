package com.alglorithm;

import org.junit.Test;

/**
 * CreatedBy cx
 * CreateTime 2018/4/18 9:17
 * Description 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示.
 */
public class NumberOf1_11 {
    public int NumberOf1(int n) {
        int a = 0;
        if (n<0){
            a++;
            n = -n;
        }
        for (int i = 0; n>0 ; i++) {
            if (n%2==1){
                a++;
            }
            n = n/2;
        }
        return a;
    }

    public int NumberOf1p(int n) {
        int a = 0;
        while (n!=0){
            a++;
            n = n&(n-1);
        }
        return a;
    }
}
