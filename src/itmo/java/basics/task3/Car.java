package itmo.java.basics.task3;

public class Car {
    private String color;
    private String name;
    private int wight;

    @Override
    public String toString(){
        String sting = (String.format("Название: %s, цвет: %s, вес: %d", this.name, this.color, this.wight));
        return sting;
    }
    public Car(String color) {
        this.color = color;
    }
    public Car(String color, int weight) {
        this.color = color;
        this.wight = weight;
    }

    public Car(){
        this.color = "БАКЛАЖАН";
        this.name = "ЧЕТЫРКА <3";
        this.wight = 1020;
    }
}
