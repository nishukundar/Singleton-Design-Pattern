package singletonDesignPattern;

import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception {

        SingletonDesignPattern s = SingletonDesignPattern.getInstance();
        System.out.println(s.hashCode());

        SingletonDesignPattern s1 = SingletonDesignPattern.getInstance();
        System.out.println(s1.hashCode());


        SingletonDesignPattern s2 = SingletonDesignPattern.getInstance();
        System.out.println(s2.hashCode());

        //Using Reflection we can break the singleton rule(we can create a new object)
        Constructor<SingletonDesignPattern> s6 = SingletonDesignPattern.class.getDeclaredConstructor();
        s6.setAccessible(true);
        System.out.println(s6.hashCode());
        SingletonDesignPattern obj = s2.getInstance();
        System.out.println(s2.hashCode());

    }


}
