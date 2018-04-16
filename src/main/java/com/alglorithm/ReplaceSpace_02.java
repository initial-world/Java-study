package com.alglorithm;

/**
 * @CreatedBy cx
 * @CreatedTime 2018/4/4 19:53
 * @description
 */
public class ReplaceSpace_02 {
    public static String replaceSpace(StringBuffer str) {
        for (int i = 0;i<str.length();i++){
            if (str.charAt(i)==' '){
                System.out.println(str.charAt(i));
                str.replace(i,i+1,"%20");
                System.out.println(str);
            }
        }
        return str.toString();
    }


    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("we are happy");
        System.out.println(replaceSpace(a));
    }
}
