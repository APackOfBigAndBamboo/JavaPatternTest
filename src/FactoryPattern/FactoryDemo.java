package FactoryPattern;

public class FactoryDemo {
    public static void main(String[] args) {
  IFruit  iFruit=Factory.getInstance("FactoryPattern.Apple");
  iFruit.eat();
  IFruit  iFruit1=Factory.getInstance("FactoryPattern.Orange");
  iFruit1.eat();

    }
}
