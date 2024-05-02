package itmo.java.basics.task6.subtask1;

public class Client extends Person {
    public String bank;

    public Client(String n, String s, String b) {
        super(n, s);
        this.bank = b;
    }

    public void setAllValues(String n, String s, String bank) {
        this.name = n;
        this.surname = s;
        this.bank = bank;
    }

    @Override
    public String toString() {
        return this.name + this.surname + this.bank;
    }
}
