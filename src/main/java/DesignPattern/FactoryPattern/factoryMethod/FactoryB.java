package DesignPattern.FactoryPattern.factoryMethod;

import DesignPattern.FactoryPattern.Product;
import DesignPattern.FactoryPattern.ProductB;

/**
 * CreatedBy cx
 * CreateTime 2018/6/15 11:05
 * Description
 */
public class FactoryB implements Factory{
    public Product createProduct(){
        return new ProductB();
    }
}
