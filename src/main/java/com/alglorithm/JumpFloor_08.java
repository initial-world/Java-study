package com.alglorithm;

/**
 * @CreatedBy cx
 * @CreateTime 2018/4/17 10:45
 * @description 可以上一级或两级台阶，有多少种方法
 */
public class JumpFloor_08 {
    public int JumpFloor(int target) {
        int a = 1;
        int b = 2;
        if(target == 1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        while (target-->3){
            int temp ;
            temp = a + b;
            a = b;
            b = temp;
        }
        return a+b;
    }
}
