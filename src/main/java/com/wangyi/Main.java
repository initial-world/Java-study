package com.wangyi;

import java.util.Scanner;

/**
 * @author cx
 * @date 2018/8/11 15:41
 * @description
 */
public class Main {


    public  void main() {
        Scanner sc = new Scanner(System.in);
        //n代表下一行n个数
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i = 0; i < n; i++){
            a[i]=sc.nextInt();
            //System.out.println(a[i]);
        }

        //m次询问
        int ask = sc.nextInt();
        //答案数组
        int b[] = new int[ask];
        for(int i = 0; i < ask; i++){
            b[i]=sc.nextInt();
            //System.out.println(b[i]);
        }
        int c[] = new int[ask];
        for (int i = 0; i < ask; i++) {
            for (int j = 0; b[i] > 0; j++) {
                b[i]-=a[j];
                c[i]=j+1;
                System.out.println(j);
            }
            System.out.println("======");
        }
        for (int i = 0; i < ask; i++) {
            System.out.println(c[i]);
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        k--;
        for (int i=0; i < m; i++) {
            k-=m*i;
            a(k,m,i);
        }
        
        
        
    }
    public static int a(int k,int m,int j){
        int i=0;
        for (i=0; i < m; i++) {
            k-=m*i;
            System.out.println(1);
        }
        if (k<0){
            return 0;
        }
        return a(k,m,i);
    }
}
