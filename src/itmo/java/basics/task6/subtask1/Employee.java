package itmo.java.basics.task6.subtask1;

public class Employee extends Person {

    public String bank;

    public Employee(String n, String s) {
        super(n, s);
    }

    public void setAllValues(String n, String s, String bank) {
        this.name = n;
        this.surname = s;
        this.bank = bank;
    }

}
