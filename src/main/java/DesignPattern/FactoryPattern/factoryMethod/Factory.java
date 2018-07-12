package DesignPattern.FactoryPattern.factoryMethod;

import DesignPattern.FactoryPattern.Product;
import DesignPattern.FactoryPattern.ProductA;

/**
 * CreatedBy cx
 * CreateTime 2018/6/15 11:01
 * Description
 */
public interface Factory {
    public Product createProduct();
}
