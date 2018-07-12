package DesignPattern.FactoryPattern.factoryMethod;

import DesignPattern.FactoryPattern.Product;
import DesignPattern.FactoryPattern.ProductA;

/**
 * CreatedBy cx
 * CreateTime 2018/6/15 10:59
 * Description
 */
public class FactoryA implements Factory{
    public Product createProduct(){
        return new ProductA();
    }
}
