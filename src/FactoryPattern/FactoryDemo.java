package FactoryPattern;

public class FactoryDemo {
    public static void main(String[] args) {
        try {
            String a = Class.forName("FactoryPattern.Apple").getName();
            IFruit aa = Factory.getInstance(a);
            aa.eat();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        IFruit iFruit = Factory.getInstance("FactoryPattern.Apple");
        iFruit.eat();
        IFruit iFruit1 = Factory.getInstance("FactoryPattern.Orange");
        iFruit1.eat();

    }
}
