package com.alglorithm;

/**
 * CreatedBy cx
 * CreateTime 2018/4/17 11:07
 * Description
 */
public class JumpFloorPlus_09 {
    public int JumpFloorII(int target) {
        int a = 1;
        int b = 2;
        if(target == 1){
            return 1;
        }if(target == 2){
            return 2;
        }else{
            return 2*JumpFloorII(target-1);
        }
    }
}
