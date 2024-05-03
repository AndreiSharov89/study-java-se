package itmo.java.basics.task7;

public class Plane {

    public class Wing {
        private int weight;

        public Wing(int weight) {
            this.weight = weight;
        }

        public void getWeight() {
            System.out.println(this.weight + " кг");
        }
    }

    public static void main(String[] args) {
        Plane embraer = new Plane();
        Wing embraerWing = embraer.new Wing(66);
        embraerWing.getWeight();
    }
}

