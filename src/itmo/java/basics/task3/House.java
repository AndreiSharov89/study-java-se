package itmo.java.basics.task3;

import java.time.Year;

public class House {
    private int floors;
    private int year;
    private String name;

    public House(int floors, int year, String name) {
        this.floors = floors;
        this.year = year;
        this.name = name;
    }

    @Override
    public String toString() {
        String s = (String.format("Этажей: %d, год постройки: %d, наименование: %s", this.floors, this.year, this.name));
        return s;
    }
    public int howOld(){
        int year = Year.now().getValue();
        return year - this.year;
    }
}
