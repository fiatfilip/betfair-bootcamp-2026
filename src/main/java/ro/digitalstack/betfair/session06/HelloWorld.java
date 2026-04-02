package ro.digitalstack.betfair.session06;

import java.util.concurrent.CountDownLatch;

import static java.lang.Thread.sleep;

public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World" + " " +Thread.currentThread().getName());
        Thread thread = new Thread(new CountingThread(10));
        Thread t2 = new Thread(() -> {
            System.out.println("Hello World" + " " +Thread.currentThread().getName());
        });
        thread.start();
        t2.start();
        for(int i = 0; i < 10; i++){
            System.out.println("Hello World Again" + " " +Thread.currentThread().getName());
            sleep(1);
        }


//        thread.run();
//        thread.start();
    }
}
