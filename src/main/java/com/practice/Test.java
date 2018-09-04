package com.practice;

import java.util.*;

/**
 * @CreatedBy cx
 * @CreatedTime [Date]
 * @description
 */

public class Test {
    public static void main(String [] args){
//        Map map = new HashMap();
//        Collection collection= new LinkedList();
//        System.out.println(Math.round(-11.6));
//        System.out.println(new B().getValue());
        System.out.println(Integer.toBinaryString(-5>>>2));
        System.out.println((-5)>>>2);
    }
    static class A{
        protected int value;
        public A(int v) {
            setValue(v);
        }
        public void setValue(int value){
            this.value = value;
        }
        public int getValue(){
            try{
                value++;
                return value;
            } catch(Exception e){
                System.out.println(e.toString());
            } finally {
                this.setValue(value);
                System.out.println(value);
            }
            return value;
        }
    }
    static class B extends A{
        public B() {
            super(5);
            setValue(getValue() - 3);
        }
        @Override
        public void setValue(int value){
            super.setValue(2 * value);
        }
    }


    public int maxArea(int a[][]){
        int n=a.length;
        int m=a[0].length;
        return 0;
    }
}