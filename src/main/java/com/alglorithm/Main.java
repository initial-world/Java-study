package com.alglorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        //已有模型数
        int n = scan.nextInt();
        //需研究的模型数
        int m = scan.nextInt();
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
            System.out.println(fabonacci(a.get(i))%1000000003L);
        }

    }
    public static long fabonacci(long n){
        if (n<5){
            return 1;
        }else {
            return 2018*(fabonacci(n-1)%1000000003L)+2017*fabonacci(n-2)%1000000003L+2016*fabonacci(n-3)%1000000003L+2015*fabonacci(n-4)%1000000003L+2014*fabonacci(n-5)%1000000003L;
        }
    }


    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        int y = in.nextInt();
//        int n = in.nextInt();
//
//        int res = x;
//        for (int i = 1; i < y; i++) {
//            res = (res*x)%n;
//        }
//        System.out.println(res);

        List<Integer> list = new ArrayList();
        List<Integer> list1 = new ArrayList();
        list1.add((Integer)3);
        list1.add((Integer)5);
        list1.add((Integer)7);
        list1.add((Integer)2);
        list1.add((Integer)6);
        list1.add((Integer)8);
        for (int i = 1,j = 0; i<14;) {
            if (list1.contains(i)){
                list1.remove((Integer)i);
                j++;
                continue;
            }else {
                list.add(i);
                j++;
            }
            if (j>3){
                i++;
                j=0;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        int sum1=15;
        int sum2=16;
        int a=0 ;
        for(int i=0;i<46;i++){
//            if(sum1>=sum2){
//                if(i+sum1-sum2<45){
//                    a+=i+sum1-sum2;
//                }else{
//                    a+=45;
//                }
//            }else{
//                if(i+sum1-sum2<=0){
//                    a+=0;
//                }else{
//                    a+=i+sum1-sum2;
//                }
//            }
            a+=biggerNum(list,i,sum2-sum1);
        }
        float p = a/2070f;
        System.out.println(p);
    }

    public static int biggerNum(List<Integer> list,int i,int a){
        int count=0;
        for (int j = 0; j < list.size(); j++) {
            if (list.get(i)+a<list.get(j)){
                count++;
            }
        }
        System.out.println("比"+list.get(i)+"大"+a+"以上的有"+count+"个");
        return count;
    }
}
