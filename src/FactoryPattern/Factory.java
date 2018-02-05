package FactoryPattern;

public class Factory {
    private Factory() {
    }

    public static <T> T getInstance(String classname) {//使用泛型 增强工厂功能特性 可以为更多的接口类服务
        T iFruit = null;
        try {
            iFruit = (T) Class.forName(classname).newInstance();//通过类 装载器来加载类的实例 相比传统的工厂模式（使用new关键字）  更加灵活
        } catch (Exception e) {
            e.printStackTrace();
        }
        return iFruit;
    }
//    public static IFruit getInstance(String classname){
//        IFruit iFruit=null;
//        try {
//            iFruit = (IFruit) Class.forName(classname).newInstance();//通过类 装载器来加载类的实例 相比传统的工厂模式（使用new关键字）  更加灵活
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return iFruit;
//    }
}
