package itmo.java.basics.task3;

public class Tree {
    private String name;
    private int age;
    private boolean isAlive;

    public Tree(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "year=" + this.age +
                ", alive=" + this.isAlive +
                ", name='" + name + '\'' +
                '}';
    }
}
