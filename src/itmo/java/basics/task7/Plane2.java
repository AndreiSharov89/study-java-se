package itmo.java.basics.task7;

public class Plane2 {

    public class Wing {
        private int weight;

        public Wing(int weight) {
            this.weight = weight;
        }

        public void getWeight() {
            System.out.println(weight + " кг");
        }
    }

    public static void main(String[] args) {
        Plane2 ssj100 = new Plane2();
        Wing wingLeft = ssj100.new Wing(99);
        Wing wingRight = ssj100.new Wing(101);
        wingLeft.getWeight();
        wingRight.getWeight();
    }
}

