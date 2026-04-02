package ro.digitalstack.betfair.session06;

import static java.lang.Thread.sleep;

public class CountingThread implements Runnable{
    int number;

    public CountingThread(int number) {
        this.number = number;
    }

    public void run() {
        for(int i = 0; i < number; i++){
            System.out.println(i + " " + Thread.currentThread().getName());
            try {
                sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
