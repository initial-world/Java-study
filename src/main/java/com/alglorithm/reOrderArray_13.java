package com.alglorithm;

import org.junit.Test;

/**
 * CreatedBy cx
 * CreateTime 2018/4/18 21:26
 * Description 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 *              所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class reOrderArray_13 {
    public void reOrderArray(int [] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                temp = array[i];
                for (int j = i+1; j < array.length; j++) {

                    if (array[j]%2==1){
                        array[i] = array[j];
                        array[j] = temp;
                        break;
                    }else {
                        int temp2 = array[j];
                        array[j] = temp;
                        temp = temp2;
                    }
                }

            }
        }
    }

    @Test
    public void reOrderArray() {
        int [] array ={1,2,3,4,5,6,7};
        int temp;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                temp = array[i];
                int temp2;
                for (int j = i+1; j < array.length; j++) {

                    if (array[j]%2==1){
                        array[i] = array[j];
                        array[j] = temp;
                        break;
                    }else if (odd(array,j)){
                        temp2 = array[j];
                        array[j] = temp;
                        temp = temp2;
                    }
                }

            }
        }

        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }
    public boolean odd(int array[],int j){
        for (int i = j; i < array.length ; i++) {
            if (array[i]%2==1){
                return true;
            }
        }
        return false;
    }
}
