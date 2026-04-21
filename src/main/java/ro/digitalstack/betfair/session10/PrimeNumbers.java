package ro.digitalstack.betfair.session10;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("13 is prime " + isPrimeImperative(13 ));
        System.out.println("26 is prime " + isPrimeLambda.test(26));
        System.out.println("37 is prime " + isPrimeStream(37));
        System.out.println("45 is odd " + isOdd.test(45));
    }

    public static boolean isPrimeImperative(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static Predicate<Integer> isPrimeLambda = number -> {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    };

    static boolean isPrimeStream(int number){
        if (number < 2) {
            return false;
        }
        return IntStream.rangeClosed(2, (int)Math.sqrt(number))
                .noneMatch(i -> number % i == 0);

    };

    static Predicate<Integer> isOdd = n -> n % 2 != 0;
}
