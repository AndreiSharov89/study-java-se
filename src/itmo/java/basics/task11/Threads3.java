package itmo.java.basics.task11;

import java.util.concurrent.CountDownLatch;

public class Threads3 extends Thread {
    private final Integer id;
    static Counter counter = new Counter();
    private final CountDownLatch latch;

    Threads3(int id, CountDownLatch latch) {
        this.id = id;
        this.latch = latch;
    }

    @Override
    public void run() {
        int i = 0;
        System.out.println("Thread id=" + id + " status: " + this.getState());
        while (i++ < 1000) {
            synchronized (counter) {
                counter.increment();
            }
        }
        System.out.println("Thread id= " + id + " Completed");
        latch.countDown();
    }

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(100);
        for (int i = 0; i < 100; i++) {
            Threads3 temp = new Threads3(i, latch);
            temp.start();
        }
        latch.await();
        System.out.println("Result: " + Threads3.counter.getCount());
    }
}
