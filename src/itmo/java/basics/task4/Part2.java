package itmo.java.basics.task4;

import java.util.Scanner;
import java.util.Arrays;

public class Part2 {
    public static void main(String[] args) {
        //1
        System.out.println("Task 1");
        int[] array1 = Part1.arrayInp();
        System.out.println("Array=" + Arrays.toString(array1));
        if (sortCheck(array1)) System.out.println("OK");
        else System.out.println("Please, try again");
        //2
        System.out.println("Task 2");
        int[] array2 = arrayInpTask22();
        System.out.println("Result: " + Arrays.toString(array2));
        //3
        System.out.println("Task 3");
        int[] array3 = Part1.arrayInp();
        System.out.println("Array 1: " + Arrays.toString(array3));
        System.out.println("Array 2: " + Arrays.toString(swapHeadTail(array3)));
        //4
        System.out.println("Task 4");
        int[] array4 = Part1.arrayInp();
        System.out.println("Array=" + Arrays.toString(array4) + "\nResult:" + findUnique(array4));
        //5
        System.out.println("Task 5");
        int[] array5 = new int[50];
        for (int i = 0; i < array5.length; i++) {
            array5[i] = (int) ((Math.random()) * 100);
        }
        int[] result5 = mergeSort(array5);
        System.out.println("Random array: " + Arrays.toString(array5));
        System.out.println("Merge-sorted random array: " + Arrays.toString(result5));


    }

    public static boolean sortCheck(int[] a) {
        if (a.length > 1) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) return false;
            }
            return true;
        }
        return true;
    }

    //to make it exact as an example
    public static int[] arrayInpTask22() {
        System.out.print("Array length: ");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        if (length > 0) {
            int[] array = new int[length];
            System.out.print("\nNumbers of array:\n");
            for (int i = 0; i < length; i++) {
                array[i] = scan.nextInt();
            }
            return array;
        } else System.out.println("Incorrect input!");
        return new int[]{};
    }

    public static int[] swapHeadTail(int[] a) {
        if (a.length > 1) {
            int temp = a[0];
            a[0] = a[a.length - 1];
            a[a.length - 1] = temp;
        }
        return a;
    }

    public static String findUnique(int[] a) {
        if (a.length > 0) {
            if (a.length == 1) return String.valueOf(a[0]);
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (a[i] == a[j] && i != j) {
                        break;
                    } else if (j == a.length - 1) {
                        return String.valueOf(a[i]);
                    }
                }
            }
            return "Not Found";
        }
        return "Wrong Array";
    }
//утащено с лекции погонять и лишний раз рассмотреть
    private static int[] mergeSort(int[] ints) {
        if (ints.length < 2) {
            return ints;
        }
        int mid = ints.length / 2;
        int[] left = new int[mid];
        int[] right;
        if (ints.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid + 1];
        }
        for (int i = 0; i < left.length; i++) {
            left[i] = ints[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = ints[mid + i];
        }
        left = mergeSort(left);
        right = mergeSort(right);
        return mergeParts(left, right);
    }

    private static int[] mergeParts(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        //System.out.println(Arrays.toString(left));
        //System.out.println(Arrays.toString(right));
        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;
        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }
}
