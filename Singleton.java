package singletonDesignPattern;

public class Singleton {
    private Singleton(){
        System.out.println("One time");
    }

//    static  Singleton s1 = new Singleton();//eager initialization

    static Singleton s1;//declaration


    public static Singleton getInstance(){//lazy initialization
        if(s1==null){
            s1=new Singleton();
        }
           return  s1;
    }
}
