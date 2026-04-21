package ro.digitalstack.betfair.session10;

import java.util.stream.IntStream;

public class Ex2 {

    public static void main(String[] args) {

        IntStream.range(0, 10).forEach(System.out::println);
        // System.out.println(i);

        IntStream myStream = IntStream.rangeClosed(0, 10);

        myStream.filter(i -> i % 2 == 0 ).forEach(System.out::println);

    }
}
