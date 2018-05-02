package com.alglorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //已有模型数
        int m = scan.nextInt(); //需研究的模型数
        ArrayList hasmodel = new ArrayList();
        ArrayList model = new ArrayList();
        for (int i = 0; i < n; i++) {
            String b = scan.next();
            hasmodel.add(b);
        }
        for (int i = 0; i < m; i++) {
            String a =scan.next();
            model.add(a);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (model.get(i).equals(hasmodel.get(j))){
                    System.out.println("NO");
                    break;
                }else {
                    if (j==n-1){
                        System.out.println("YES");
                        hasmodel.add(model.get(i));
                        n++;
                        break;
                    }
                }
            }
        }
    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Long> a = new ArrayList();
        for (int i = 0; i <1 ; i++) {
            a.add(scan.nextLong());
        }

        for (int i = 0; i < a.size(); i++) {
            System.out.println(fabonacci(a.get(i))%1000000003l);
        }

    }
    public static long fabonacci(long n){
        if (n<5){
            return 1;
        }else {
            return 2018*(fabonacci(n-1)%1000000003l)+2017*fabonacci(n-2)%1000000003l+2016*fabonacci(n-3)%1000000003l+2015*fabonacci(n-4)%1000000003l+2014*fabonacci(n-5)%1000000003l;
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int n = in.nextInt();

        int res = x;
        for (int i = 1; i < y; i++) {
            res = (res*x)%n;
        }
        System.out.println(res);
    }
}
