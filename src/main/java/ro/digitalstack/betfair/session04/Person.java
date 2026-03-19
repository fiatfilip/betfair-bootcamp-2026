package ro.digitalstack.betfair.session04;

import java.util.*;

public class Person implements Comparable<Person> {
    private String ssn;
    private Integer age;



    public Person(String ssn, Integer age) {
        this.ssn = ssn;
        this.age = age;
    }

    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(ssn, person.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ssn);
    }

    @Override
    public String toString() {
        return "Person{" +
                "ssn='" + ssn + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>();
        Person p1 = new Person("a123a", 20);
        Person p2 = new Person("2z123", 20);
        Person p4 = new Person("abc123", 50);
        Person p5 = new Person("123xyz", 10);
        Person p3 = new Person("456", 30);
        System.out.println(p1.equals(p2));
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        System.out.println(set.size());
        for(Person p : set){
            System.out.println(p);
        }
        System.out.println("--------");
        Set<Person> set2 = new TreeSet<>(new SSNComparator());
        set2.addAll(set);
        for(Person p : set2){
            System.out.println(p);
        }
    }

    @Override
    public int compareTo(Person o) {
        if(this.age.compareTo(o.age) == 0){
            return ssn.compareTo(o.ssn);
        }else{
            return age.compareTo(o.age);
        }
    }
}
