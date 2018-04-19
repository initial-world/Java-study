package com.alglorithm;

import org.junit.Test;

/**
 * CreatedBy cx
 * CreateTime 2018/4/18 9:44
 * Description 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Power_12 {
    public double Power(double base, int exponent) {
        double result=1;
        if (exponent>0) {
            while (exponent > 0) {
                if (exponent % 2 == 1) {
                    result = result * base;
                }
                base = base * base;
                exponent = exponent >> 1;
            }
        }else if (exponent<0) {
            exponent = -exponent;
            while (exponent > 0) {
                if (exponent % 2 == 1) {
                    result = result * base;
                }
                base = base * base;
                exponent = exponent >> 1;
            }
            result = 1/result;
        }else {
            result = 1;
        }
        return result;
    }
    @Test
    public void Power() {
        double base=2;int exponent=-3;
        double result=1;
        if (exponent>0) {
            while (exponent > 0) {
                if (exponent % 2 == 1) {
                    result = result * base;
                }
                base = base * base;
                exponent = exponent >> 1;
            }
            System.out.println(result);
        }else if (exponent<0) {
            exponent = -exponent;
            while (exponent > 0) {
                if (exponent % 2 == 1) {
                    result = result * base;
                }
                base = base * base;
                exponent = exponent >> 1;
            }
            System.out.println(1/result) ;
        }else {
            System.out.println(1);
        }
    }
}
