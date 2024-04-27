package itmo.java.basics.task4;

import java.util.Scanner;
import java.util.Arrays;

public class Part1 {
    public static void main(String[] args){
        //1
        for (int i = 1; i < 100; i=i+2){
            System.out.print(i + " ");
        }
        System.out.println();
        //2
        System.out.print("Делится на 3: ");
        for (int i = 3; i <= 100; i = i + 3) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Делится на 5: ");
        for (int i = 5; i <= 100; i = i + 5) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Делится на 3 и на 5: ");
        for (int i = 15; i <= 100; i = i + 15) {
            System.out.print(i + " ");
        }
        System.out.println();
        //3
        boolean task3Check = false;
        int[] a = new int [3];
        Scanner scan3 = new Scanner(System.in);
        System.out.print("\nВведите первое число: ");
        a[0] = scan3.nextInt();
        System.out.print("\nВведите второе число: ");
        a[1] = scan3.nextInt();
        System.out.print("\nВведите третье число: ");
        a[2] = scan3.nextInt();
        if ((a[0] + a[1]) == a[2]) {
            task3Check = true;
        }
        System.out.println(task3Check);
        //4
        boolean task4Check = false;
        int[] b = new int [3];
        Scanner scan4 = new Scanner(System.in);
        System.out.print("\nВведите первое число: ");
        b[0] = scan4.nextInt();
        System.out.print("\nВведите второе число: ");
        b[1] = scan4.nextInt();
        System.out.print("\nВведите третье число: ");
        b[2] = scan4.nextInt();
        if ((b[0] < b[1]) && (b[1] < b[2])) {
            task4Check = true;
        }
        System.out.println(task4Check);
        //5
        int[] array5 = arrayInp();
        System.out.println("array=" + Arrays.toString(array5)+"\n"+checkFirstLast3(array5));
        //6
        System.out.println("\nSubtask 6");
        int[] array6 = arrayInp();
        System.out.println("array=" + Arrays.toString(array6) + "\n" + check1sor3s(array6));
    }
    public static int[] arrayInp() {
        System.out.print("Введите количество элементов: ");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        if (length > 0) {
            int[] array = new int[length];
            for (int i = 0; i < length; i++) {
                System.out.print("\nВведите элемент " + (i + 1) + ": ");
                array[i] = scan.nextInt();
            }
            return array;
        } else System.out.println("Некорректное значение!");
        return new int[]{};
    }
    private static boolean checkFirstLast3(int[] a){
        return (a.length != 0 && (a[0] == 3 || a[a.length - 1] == 3));
    }
    private static boolean check1sor3s(int[] a) {
        for (int i : a) {
            if (i == 1 || i == 3) {
                return true;
            }
        }
        return false;
    }
}
