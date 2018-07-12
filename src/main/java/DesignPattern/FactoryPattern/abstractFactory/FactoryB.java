package DesignPattern.FactoryPattern.abstractFactory;

import DesignPattern.FactoryPattern.Product;
import DesignPattern.FactoryPattern.ProductB;

/**
 * CreatedBy cx
 * CreateTime 2018/6/20 21:10
 * Description
 */
public class FactoryB implements Factory {
    public Product createProduct() {
        return new ProductB();
    }

    public Gift createGift() {
        return new GiftB();
    }
}
