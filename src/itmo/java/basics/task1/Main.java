package itmo.java.basics.task1;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Scanner scanner5 = new Scanner(System.in);
        Scanner scanner6 = new Scanner(System.in);

        System.out.println("Я\nхорошо\nзнаю\nJava.");

        double x21 = (46 + 10) * (10d / 3);
        System.out.printf("Задача 2: %.2f", x21);
        int i = (4) * (-15);
        double x22 = 29 * i;
        System.out.printf(", " + x22 + "\n");

        int number = 10500;
        double result = (double) (number / 10) / 10;
        System.out.printf("Задача 3: %.2f \n", result);

        result = 3.6 * 4.1 * 5.9;
        System.out.printf("Задача 4: %.4f\n", result);

        Deque<Integer> deque = new ArrayDeque<>();
        System.out.println("Задание 5, ввод целых чисел:");
        String input;
        for (input = scanner5.nextLine(); !input.isEmpty(); input=scanner5.nextLine()) {
            try {
                int inputInt = Integer.valueOf(input);
                deque.add(inputInt);
            } catch (Exception e) {
                break;
            }
        }
        while (!deque.isEmpty()) {
            System.out.println(deque.pollFirst());
        }

        System.out.println("Задание 6, введите b:");
        int b = scanner6.nextInt();
        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if ((b % 2 == 0) && (b > 100)) {
            System.out.println("Выход за пределы диапазона");
        } else {
            System.out.println("Четное");
        }
    }
}
