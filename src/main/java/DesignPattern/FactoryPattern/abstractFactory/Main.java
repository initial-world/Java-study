package DesignPattern.FactoryPattern.abstractFactory;

import DesignPattern.FactoryPattern.Product;

/**
 * CreatedBy cx
 * CreateTime 2018/6/20 21:31
 * Description
 */
public class Main {
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        factoryA.createProduct();
        factoryA.createGift();
        FactoryB factoryB = new FactoryB();
        factoryB.createProduct();
        factoryB.createGift();
    }
}
