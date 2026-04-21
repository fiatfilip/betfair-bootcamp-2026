package ro.digitalstack.betfair.session10;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierConsumer {
    public static void main(String[] args) {
        Stream.generate(numberGenerator)
                .limit(10)
                .sorted(Integer::compareTo)
                .forEach(System.out::println);

        numberConsumer.accept(numberGenerator.get());
    }

    static Supplier<Integer> numberGenerator = () -> ThreadLocalRandom.current().nextInt();
    static Consumer<Integer> numberConsumer = number -> System.out.println("Generated number is: " + number);
}
