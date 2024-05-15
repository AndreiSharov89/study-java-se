package itmo.java.basics.task11;

public class Threads2 extends Thread {

    public void run() {
        System.out.println("Running thread status: " + this.getState());
        this.yield();
    }

    public static void main(String[] args) throws InterruptedException {
        Threads2 temp = new Threads2();
        System.out.println("Thread  status before start: " + temp.getState());
        temp.start();
        //даём потокам "подышать":
        sleep(10);
        System.out.println("Finished thread status: " + temp.getState());
    }
}
