package itmo.java.basics.task6.subtask1;

//import java.util.Scanner;

public abstract class Person {
    public String name;
    public String surname;

    //protected Scanner scan = new Scanner(System.in);
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String name) {
        this.surname = name;
    }

    public String getSurname() {
        return surname;
    }


    public Person(String n, String s) {
        this.name = n;
        this.surname = s;
    }

    @Override
    public String toString() {
        return "Parent:name=" + name + " surname=" + surname;
    }
}
