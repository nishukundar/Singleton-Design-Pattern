package singletonDesignPattern;

public class Main {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s42 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
    }
}
