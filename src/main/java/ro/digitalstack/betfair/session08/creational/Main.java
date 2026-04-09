package ro.digitalstack.betfair.session08.creational;

public class Main {
//    static {
//        Singleton x;
//    }
    public static void main(String[] args) {
        System.out.println("prima linie");

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(singleton1);
    }
}
