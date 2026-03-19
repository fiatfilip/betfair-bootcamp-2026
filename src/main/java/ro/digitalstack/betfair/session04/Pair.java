package ro.digitalstack.betfair.session04;

import java.util.ArrayList;
import java.util.List;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Pair<Integer,String> pair = new Pair<>(65, "A");
        //System.out.println(pair.getKey());
        List<Pair<Integer, String>> list = new ArrayList<>();
        list.add(pair);
        list.add(new Pair<>(66, "B"));
        String letter = "B";
        for(Pair<Integer, String> pair2 : list) {
            if(pair2.getValue().equalsIgnoreCase(letter)) {
                System.out.println(pair2.getKey());
            }
        }
    }
}
