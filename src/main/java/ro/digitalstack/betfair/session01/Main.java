package ro.digitalstack.betfair.session01;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println("Salutare");
        for (String name : args){
            System.out.println(name);
        }
        System.out.println(MyPPClass.sayHello("Filip"));

        System.out.println(MyPPClass.class.getMethod("sayHello", String.class).invoke("name", "Filip"));
    }
}
