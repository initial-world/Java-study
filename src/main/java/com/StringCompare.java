package com;

import java.util.Scanner;

/**
 * @CreatedBy cx
 * @CreatedTime [Date]
 * @description
 */
public class StringCompare {
    public static void main(String[] args) {

            //a("abc","ads");

            Scanner scanner = new Scanner(System.in);
            String a = scanner.next().toString();
            String b = scanner.next().toString();
            System.out.println("sss:" + caculate(a, b));


        }


        public static int caculate(String s,String b){
            int a = 0;
            for(int i = 0;i<=s.length()-b.length();i++){
                for (int j = 0; j<b.length();j++){
                    if (s.charAt(i+j)!=b.charAt(j)){
                        a++;
                    }
                }
            }
            return a;
        }

}

