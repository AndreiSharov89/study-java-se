package itmo.java.basics.task6.subtask4;

public class Parent {
    protected int intValue;

    public Parent() {
    }

    public void setIntValue(int intValue) {
        System.out.println("Передано значение " + intValue);
        this.intValue = intValue;
    }
}
