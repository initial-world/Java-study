package com.sort;

/**
 * @author cx
 * @date 2018/8/28 20:00
 * @description
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class as{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String a = scanner.next();
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        //一提
        //System.out.println(getNum(a));

//        二题
//        List c = fanzhuan(a,b);
//        for (int i = 0; i < c.size(); i++) {
//            System.out.print(c.get(i));
//        }


    }

    //再一个题
















    //又一个题
    public static List fanzhuan(String a,int b){
        int len = a.length();
        Stack str = new Stack();
        List finalStr  = new ArrayList();
        int c = len/(3*b)+1;
        for (int i = 0; i < c; i++) {
            for (int j = i*b*3; j < i*b*3+b&&j<len; j++) {
                str.push(a.charAt(j));
            }
            while (!str.isEmpty()){
                finalStr.add(str.pop());
            }
            for (int j = i*b*3+b; j < i*b*3+3*b&&j<len; j++) {
                finalStr.add(a.charAt(j));
            }
        }
        return finalStr;
    }











    //一个题







    public static int getNum(String a){
        int num=0;
        int l=a.length()-1;
        int r=a.length()-1;
        for (; l>=0 ; ) {
            //System.out.println(l+"两头"+r);
            if (charToInt(a.charAt(r))%3==0){
                num++;
                r--;
                l--;
                continue;
            }else {
                l--;
                if (charsToInt(a,l,r)%3==0){
                    //System.out.println(l+"被整除"+r);
                    num++;
                    r=l-1;
                    l=l-1;
                }else {
                    //System.out.println(l+"没被整除"+r);
                    continue;
                }
            }
        }
        return num;
    }

    public static int charsToInt(String a,int l,int r){
        int num=0;
        //System.out.println(l+"=============="+r);
        for (int i = r,j = 1; i >= l; i--,j*=10) {
            num+=charToInt(a.charAt(i))*j;
        }
        return num;
    }

    public static int charToInt(char a){
        return (int)a-'0';
    }



}

