package itmo.java.basics.task7;

public class Plane {
    public class Wing {
        private int weight;

        public Wing(int weight) {
            this.weight = weight;
        }

        public void getWingWeight() {
            System.out.println(String.format(weight + " кг"));
        }
    }

    public static void main(String[] args) {
        Plane embraer = new Plane();
        Wing left = embraer.new Wing(99);
        Wing right = embraer.new Wing(101);
        left.getWingWeight();
        right.getWingWeight();
    }
}
