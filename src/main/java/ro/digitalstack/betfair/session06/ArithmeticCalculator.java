package ro.digitalstack.betfair.session06;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class ArithmeticCalculator {
    public static void main(String[] args) throws InterruptedException {
        ArithmeticSeries s1 = new ArithmeticSeries(2, 3);
        ArithmeticSeries s2 = new ArithmeticSeries(3, 2);

        s1.start();
        s2.start();
        s1.join();
        s2.join();
        System.out.println(s1.getElement()  + s2.getElement());

        ArithmeticSeries[] arr = new ArithmeticSeries[100];
        List<Integer> list = new Vector<>();
        for(int i = 0; i < arr.length; i++){
            arr[i] = new ArithmeticSeries(i, i + 1);
            arr[i].setCollectorList(list);
            arr[i].start();
            arr[i].join();
        }

        for(int i = 0; i < arr.length; i++){
            arr[i].join();
        }

        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }

        System.out.println((Integer) list.stream().mapToInt(Integer::intValue).sum());
    }
}
