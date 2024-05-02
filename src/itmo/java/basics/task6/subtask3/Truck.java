package itmo.java.basics.task6.subtask3;

public class Truck extends Car {
    int wheelsCount;
    int maxWeight;

    public void setWheels(int wheels) {
        this.wheelsCount = wheels;
        System.out.println("Новое количество колес: " + this.wheelsCount);
    }

    public Truck(int wheight, String model, char color, float speed, int wheels, int maxWeight) {
        super(wheight, model, color, speed);
        this.wheelsCount = wheels;
        this.maxWeight = maxWeight;
    }

    @Override
    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет грузовика - " + color + " и её скорость - " + speed);
        System.out.println("Максимальная снаряженная масса - " + maxWeight + " кг. Количество колес - " + wheelsCount);
    }

}