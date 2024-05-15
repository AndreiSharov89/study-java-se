package itmo.java.basics.task11;


public class Threads31 extends Thread {
    private final Integer id;
    static Counter counter = new Counter();

    Threads31(int id) {
        this.id = id;
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
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            Threads31 temp = new Threads31(i);
            temp.start();
        }
        //даём потокам "подышать":
        sleep(1000);
        System.out.println("Result: " + Threads31.counter.getCount());
    }
}
