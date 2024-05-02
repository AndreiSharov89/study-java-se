package itmo.java.basics.task6.subtask5;

public class Subperson extends Person {
    protected String name;

    @Override
    public void input() {
        System.out.print("Введите имя: ");
        this.name = scan.next();
        super.input();
    }
}

