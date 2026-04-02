package ro.digitalstack.betfair.session06;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticSeries extends Thread{
    int ratio;
    int position;
    private List<Integer> collectorList;

    public ArithmeticSeries(int ratio, int position) {
        this.ratio = ratio;
        this.position = position;
    }

    private int element;

    @Override
    public void run() {
        element = 1 + ratio * (position - 1);
        collectorList.add(element);
        System.out.println(element + " " + Thread.currentThread().getName());
    }

    public int getElement(){
        return element;
    }

    public void setCollectorList(List<Integer> collectorList) {
        this.collectorList = collectorList;
    }
}
