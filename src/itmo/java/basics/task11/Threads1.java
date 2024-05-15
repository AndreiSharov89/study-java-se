package itmo.java.basics.task11;

public class Threads1 extends Thread {
    protected int counter;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public Threads1(int counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        int i = 0;
        System.out.println("thread id= " + id + " value= " + i);
        while (i++ < counter) {
            System.out.println("thread id= " + id + " value= " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Threads1 temp = new Threads1(100);
            temp.start();
        }
    }
}
