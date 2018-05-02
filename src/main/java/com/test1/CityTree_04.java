package com.test1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * CreatedBy cx
 * CreateTime 2018/4/19 21:29
 * Description魔法王国一共有n个城市,编号为0~n-1号,n个城市之间的道路连接起来恰好构成一棵树。
 小易现在在0号城市,每次行动小易会从当前所在的城市走到与其相邻的一个城市,小易最多能行动L次。
 如果小易到达过某个城市就视为小易游历过这个城市了,小易现在要制定好的旅游计划使他能游历最多的城市,
 请你帮他计算一下他最多能游历过多少个城市(注意0号城市已经游历了,游历过的城市不重复计算)。
 输入描述:
 输入包括两行,第一行包括两个正整数n(2 ≤ n ≤ 50)和L(1 ≤ L ≤ 100),表示城市个数和小易能行动的次数。
 第二行包括n-1个整数parent[i](0 ≤ parent[i] ≤ i), 对于每个合法的i(0 ≤ i ≤ n - 2),在(i+1)号城市和parent[i]间有一条道路连接。


 输出描述:
 输出一个整数,表示小易最多能游历的城市数量。

 输入例子1:
 5 2
 0 1 2 3

 输出例子1:
 3
 */
public class CityTree_04 {
    public static void getStep(City city){
        for(int i = 0;i < city.list.size();i++){
            city.list.get(i).step = city.step +1; //子节点的步数等于当前父节点的步数加1
            getStep(city.list.get(i));  //有子节点的话继续回调
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //城市数
        int L = scan.nextInt(); //行走次数
        City[] citys = new City[n];
        for(int i = 1;i<n;i++){ //从1开始
            int temp = scan.nextInt(); //i与parent[i-1]有一条道路连接
            if(citys[i] == null){
                citys[i] = new City();
            }
            if(citys[temp] == null){
                citys[temp] = new City();
            }
            //citys[i].pre = citys[temp];
            citys[temp].list.add(citys[i]);
        }
        //计算每一个城市节点的步数,因为一开始在城市0，所以从citys[0]开始
        getStep(citys[0]);
        int maxLen = 0; //城市树的最长步数
        for(int j = 1;j <n; j++){
            if(citys[j].step > maxLen){
                maxLen = citys[j].step;
            }
        }

        if(maxLen >=L){ //如果行走次数小于或等于最长步数，则直接输出 L+1（1是指一开始已游历的0号城市）
            System.out.println( L+1);
            return ;
        }
        //否则的话,则有以下两种情况,  根据二叉树的结构，每多走一个城市就要多花费两步
        int rest = (L - maxLen)/2 ;//剩下可行走的次数还可以走多少个城市
        int remainingCity = n - maxLen - 1; //还没有游历过的城市个数
        //1.如果还可以游历的城市的个数大于或等于没有有游历过的城市个数，则小易可以把所有城市都游历完。
        if(rest > remainingCity){
            System.out.println(n);
            return;
        }else{  //2.否则，小易最多可以游历 (maxLen+rest+1)个城市
            System.out.println(maxLen+rest+1);
            return;
        }
    }

        static class City{
            int step;
            //City pre;
            ArrayList<City> list = new ArrayList<City>();
        }
}