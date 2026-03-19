package ro.digitalstack.betfair.session04;

import java.util.Comparator;

public class SSNComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getSsn().compareTo(o2.getSsn());
    }
}
