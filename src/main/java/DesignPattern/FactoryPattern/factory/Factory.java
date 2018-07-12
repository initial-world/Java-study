package DesignPattern.FactoryPattern.factory;

import DesignPattern.FactoryPattern.Product;
import DesignPattern.FactoryPattern.ProductA;
import DesignPattern.FactoryPattern.ProductB;

/**
 * CreatedBy cx
 * CreateTime 2018/6/15 10:53
 * Description 简单工厂
 */
public class Factory {
    public static Product create(String str){
        if (str.equals("A")){
            return new ProductA();
        }else if (str.equals("B")){
            return new ProductB();
        }
        return null;
    }
}
