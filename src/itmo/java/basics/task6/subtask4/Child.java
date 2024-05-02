package itmo.java.basics.task6.subtask4;

public class Child extends Parent {

    public int getIntField() {
        System.out.println("Получено значение " + intValue);
        return this.intValue;
    }
}
