package com.alglorithm;

import org.junit.Test;

/**
 * CreatedBy cx
 * CreateTime 2018/4/17 11:17
 * Description 用2*1的矩形覆盖2*n的矩形，有多少种方法
 */


/*
n = 1 : f(1)=1
n = 2 : f(2)=2
n = 3 : 第一个横着 f(2) 第一个竖着 f(1),f1+f2
...
n = k : 第一个横着 f(k-1) 第一个竖着 f(k-2),f(k) = f(k-1)+f(k-2)  Febonacci
 */

public class RectCover_10 {
    public int RectCover(int target) {
        int f = 1,g = 2;
        if(target == 0){
            return 0;
        }if(target == 1){
            return 1;
        }if(target == 2){
            return 2;
        }
        while(target-->2) {
            g += f;
            f = g - f;
        }
        return g;
    }

    public int RectCover2(int target) {
        if(target == 0){
            return 0;
        }if(target == 1){
            return 1;
        }if(target == 2){
            return 2;
        }else {
            return RectCover2(target-1)+RectCover2(target-2);
        }
    }
}
