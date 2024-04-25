package itmo.java.basics.task3;


public class JavaProgram {
    public static void main(String[] args) {
        Study task1 = new Study("Изучение Java - это просто");
        System.out.println(task1.printCourse());
//        Car car0 = new Car();
//        System.out.println(car0.toString());
        Car car1 = new Car("Белый", 1234);
        System.out.println(car1.toString());
        Car car2 = new Car("Красный");
        System.out.println(car2.toString());
        House home = new House(25, 2008, "Коллонтай 5/1");
        System.out.println(home);
        System.out.println("Возраст: " + home.howOld() + " лет (год)");
        House rent = new House(15, 2003, "Савушкина 140");
        System.out.println(rent);
        System.out.println("Возраст: " + rent.howOld() + " лет (год)");
        Tree tree1 = new Tree("Дуб",440, false);
        System.out.println(tree1);
        Tree tree2 = new Tree(880, "Береза");
        System.out.println(tree2);
        Tree tree3 = new Tree();
    }
}

