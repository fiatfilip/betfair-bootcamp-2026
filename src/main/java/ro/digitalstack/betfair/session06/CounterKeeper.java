package ro.digitalstack.betfair.session06;

public class CounterKeeper {
    private volatile Integer counter;

    public CounterKeeper(Integer counter) {
        this.counter = counter;
    }

    public Integer getCounter() {
        return counter;
    }

    public void increment() {
        Object o1 = new Object();
        Object o2 = new Object();
        synchronized (o1) {
            synchronized (o2) {
                System.out.println(counter);
            }
        }
//        System.out.println(counter);
        synchronized (this) {
            counter++;
        }
        synchronized (o2) {
            synchronized (o1) {
                System.out.println(counter);
            }
        }
//        System.out.println(counter);
    }

    public static void main(String[] args) throws InterruptedException {
        CounterKeeper counterKeeper = new CounterKeeper(1);
        CounterIncrementor[] incrementors = new CounterIncrementor[1000];
        for(int i = 0; i < incrementors.length; i++){
            incrementors[i] = new CounterIncrementor(counterKeeper);
            incrementors[i].start();

        }

         for(int i = 0; i < incrementors.length; i++){
            incrementors[i].join();
        }
        System.out.println(counterKeeper.getCounter());

    }

}

class CounterIncrementor extends Thread {
    private CounterKeeper counterKeeper;
    public CounterIncrementor(CounterKeeper counterKeeper) {
        this.counterKeeper = counterKeeper;
    }

    @Override
    public void run() {
        counterKeeper.increment();
    }
}
