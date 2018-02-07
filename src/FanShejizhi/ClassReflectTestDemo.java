package FanShejizhi;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassReflectTestDemo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException, NoSuchFieldException {

        String attribute="name";
        String value="MLDN";
        Class<?> cls= Class.forName("FanShejizhi.Person");//获取类
        Object obj=cls.newInstance();//实例化类对象
        //取得setName这个方法的实例化对象  setName是一个方法的属性名称，
        // 这里使用给定的属性信息拼凑得到，同时改方法需要一个String型的参数
        Field field=cls.getDeclaredField(attribute);
        Method setMathod=cls.getMethod("set"+inincap(attribute),field.getType());
        //通过Method类对象调用指定的方法，调用方法必须有实例化对象  ，同时传入所需参数
        setMathod.invoke(obj,value);
        Method getMethod=cls.getMethod("get"+inincap(attribute));
        Object ret =getMethod.invoke(obj);//等价于Person.getName()
        System.out.println(ret);
    }
    public static  String inincap(String string){
        return string.substring(0,1).toUpperCase()+string.substring(1);
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}