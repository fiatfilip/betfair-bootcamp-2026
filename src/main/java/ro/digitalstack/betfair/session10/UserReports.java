package ro.digitalstack.betfair.session10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserReports {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(12, "John", "Doe"));
        users.add(new User(25, "Jane", "Doe"));
        users.add(new User(3, "Joe", "Cluj"));
        users.add(new User(43, "Ana", "Bucuresti"));
        users.add(new User(52, "Maria", "Brasov"));
        users.add(new User(16, "Andrei", "Paris"));
        users.add(new User(7, "Larisa", "Iasi"));
        users.add(new User(18, "Julia", "Budapesta"));
        users.add(new User(49, "Marian", "Viena"));
        users.add(new User(10, "Laura", "Paris"));

        users.stream()
                .filter( i -> i.age() > 18)
                .forEach(System.out::println);

        users.stream()
                .filter( i -> i.city().equals("Sydney") )
                .forEach(System.out::println);

       Optional<User> emily = users.stream()
                .filter(i -> i.city().equals("Paris")).findFirst();
       emily.ifPresent(System.out::println);

       users.stream()
               .map (User::age).max(Integer::compareTo).ifPresent(System.out::println);

       users.stream()
               .map(i -> i.city())
               .distinct()
               .toList()
               .forEach(System.out::println);
    }

}

record User(int age, String name, String city) {

}
