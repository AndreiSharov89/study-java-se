package itmo.java.basics.task11;

public class Threads4 extends Thread {
    private final String name;
    private final Integer temp;

    Threads4(String name, Integer temp) {
        this.name = name;
        this.temp = temp;
    }

    public void showName() {
        System.out.println(this.name);
    }

    @Override
    public void run() {
        synchronized (temp) {
            while (true) {
                showName();
                temp.notify();
                try {
                    temp.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer temp = 0;
        Threads4 name1 = new Threads4("Andrei", temp);
        Threads4 name2 = new Threads4("Arthur", temp);
        name1.start();
        name2.start();
    }
}

