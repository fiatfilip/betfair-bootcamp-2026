package ro.digitalstack.betfair;

import ro.digitalstack.betfair.session01.Main;

import java.lang.reflect.InvocationTargetException;
// import ro.digitalstack.betfair.session01.MyPPClass;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        Main.main(new String[]{"Filip", "Marcel"});
        // MyPPClass.sayHello("Filip");
    }
}
