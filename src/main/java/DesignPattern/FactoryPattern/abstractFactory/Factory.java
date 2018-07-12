package DesignPattern.FactoryPattern.abstractFactory;

import DesignPattern.FactoryPattern.Product;
import DesignPattern.FactoryPattern.ProductA;
import DesignPattern.FactoryPattern.ProductB;

/**
 * CreatedBy cx
 * CreateTime 2018/6/20 20:43
 * Description
 */
public interface Factory {
    Product createProduct();
    Gift createGift();
}
