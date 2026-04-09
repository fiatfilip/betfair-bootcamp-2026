package ro.digitalstack.betfair.session08.creational;

public class Singleton {
    private Singleton() {
        System.out.println("Rdsdasdasda");
    }

    private static Singleton singletonInstance;

    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (Singleton.singletonInstance != null) {
                return singletonInstance;
            } else {
                Singleton.singletonInstance = new Singleton();
                return singletonInstance;
            }
        }
    }
}
