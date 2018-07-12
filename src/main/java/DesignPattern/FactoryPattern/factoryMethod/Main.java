package DesignPattern.FactoryPattern.factoryMethod;

/**
 * CreatedBy cx
 * CreateTime 2018/6/15 11:06
 * Description 工厂方法模式：实现“开放封闭原则”，不修改原代码，增加工厂类
 */
public class Main {
    public static void main(String[] args) {
        Factory factory;
        factory = new FactoryA();
        factory.createProduct();
        factory = new FactoryB();
        factory.createProduct();
    }
}
