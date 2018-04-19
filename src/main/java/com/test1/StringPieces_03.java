package com.test1;

import java.util.Scanner;

/**
 * CreatedBy cx
 * CreateTime 2018/4/19 20:15
 * Description一个由小写字母组成的字符串可以看成一些同一字母的最大碎片组成的。
 * 例如,"aaabbaaac"是由下面碎片组成的:'aaa','bb','c'。
 * 牛牛现在给定一个字符串,请你帮助计算这个字符串的所有碎片的平均长度是多少。

 输入描述:
 输入包括一个字符串s,字符串s的长度length(1 ≤ length ≤ 50),s只含小写字母('a'-'z')


 输出描述:
 输出一个整数,表示所有碎片的平均长度,四舍五入保留两位小数。

 如样例所示: s = "aaabbaaac"
 所有碎片的平均长度 = (3 + 2 + 3 + 1) / 4 = 2.25

 输入例子1:
 aaabbaaac

 输出例子1:
 2.25
 */
public class StringPieces_03 {

    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        String n = sb.nextLine();
        Integer result = n.length();
        Double resultd = result.doubleValue();
        Double count = 0.00;
        for (int i = 0; i < n.length();i++) {
            char a = n.charAt(i);
            count++;
            for (int j = i+1; j < n.length(); j++) {
                System.out.println(n.charAt(j));
                if (j==n.length()-1){
                    if (n.charAt(i)==n.charAt(j)){
                        i=j+1;
                        break;
                    }else {
                        i=j-1;
                        break;
                    }
                }
                if (a==n.charAt(j)){
                    continue;
                }else {
                    i=j-1;
                    break;
                }
            }
        }
        Double f = resultd/count;
        System.out.println(resultd+"aaaa"+count);
        System.out.println(String.format("%.2f",f ));
    }
}
