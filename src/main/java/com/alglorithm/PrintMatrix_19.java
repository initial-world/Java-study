package com.alglorithm;

import java.util.ArrayList;

/**
 * CreatedBy cx
 * CreateTime 2018/4/24 15:54
 * Description输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下矩阵：
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 * 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class PrintMatrix_19 {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        int row = matrix.length;//行
        int columns = matrix[0].length;//列
        int circle = 0;
        circle = (Math.min(row,columns)+1)/2;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int k = 0; k < circle; k++) {

            for (int j = k; j < columns - k; j++) {//→
                arrayList.add(matrix[k][j]);
            }
            for (int i = k+1 ; i < row - k; i++) {//↓
                arrayList.add(matrix[i][columns - k - 1]);
            }
            for (int j = columns - k - 2; j > k&&row-k-1!=k; j--) {//←
                arrayList.add(matrix[row - k - 1][j]);
            }

            for (int i = row - k - 1; i > k&&columns-k-1!=k; i--) {//↑
                arrayList.add(matrix[i][k]);
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int [][]a = {{1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};
        ArrayList b = printMatrix(a);
        for (int i = 0; i < b.size(); i++) {
            System.out.println(b.get(i));
        }
    }
}
