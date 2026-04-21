package ro.digitalstack.betfair.session10;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> mainList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        listOfDoubleOdds(mainList);

        for ( Integer integer : listOfDoubleOdds(mainList)) {
            System.out.println(integer);
        }

    }

    public static List<Integer> listOfDoubleOdds(List<Integer> numbers) {
        List<Integer> list = new ArrayList<>();
        for ( Integer i : numbers ) {
            if ( i % 2 != 0 ) {
                list.add(i*2);
            }
        }
        return list;
    }

    public static List<Integer> XYZW(List<Integer> numbers) {
        return numbers.stream()
                .filter(i -> i % 2 != 0)
                .map(x -> x * 2 )
                .toList();

    }

    public static List<String> XYZW2(List<String> names){
        return names.stream()
                .filter(s -> s.length() > 2)
                .map( s -> s.toUpperCase())
                .toList();
    }
}
