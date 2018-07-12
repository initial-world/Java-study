package DesignPattern.FactoryPattern.abstractFactory;

import DesignPattern.FactoryPattern.Product;
import DesignPattern.FactoryPattern.ProductA;

/**
 * CreatedBy cx
 * CreateTime 2018/6/20 20:47
 * Description
 */
public class FactoryA implements Factory {
    public Product createProduct() {
        return new ProductA();
    }

    public Gift createGift() {
        return new GiftA();
    }
}
