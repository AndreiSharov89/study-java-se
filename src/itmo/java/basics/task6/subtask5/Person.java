package itmo.java.basics.task6.subtask5;

import java.util.Scanner;

public class Person {
    protected Scanner scan = new Scanner(System.in);
    protected int age;

    public Person() {
    }

    public void input() {
        System.out.print("Введите возраст: ");
        this.age = scan.nextInt();
    }

    public static void main(String[] args) {
        Subperson sub = new Subperson();
        sub.input();
        System.out.println((sub.name + ", " + sub.age));
    }
}
