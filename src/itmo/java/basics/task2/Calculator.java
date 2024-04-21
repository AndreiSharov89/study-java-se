package itmo.java.basics.task2;

public class Calculator {
    //сложение
    public static double summ(int a, int b) {
        int i = a + b;
        return i;
    }

    public static double summ(long a, int b) {
        long i = a + b;
        return i;
    }

    public static double summ(int a, long b) {
        long i = a + b;
        return i;
    }

    public static double summ(long a, long b) {
        long i = a + b;
        return i;
    }

    public static double summ(double a, double b) {
        double i = a + b;
        return i;
    }

    public static double summ(double a, int b) {
        double i = a + b;
        return i;
    }

    public static double summ(int a, double b) {
        double i = a + b;
        return i;
    }

    public static double summ(double a, long b) {
        double i = a + b;
        return i;
    }

    public static double summ(long a, double b) {
        double i = a + b;
        return i;
    }

    //вычитание
    public static double subtr(int a, int b) {
        int i = a - b;
        return i;
    }

    public static double subtr(long a, int b) {
        long i = a - b;
        return i;
    }

    public static double subtr(int a, long b) {
        long i = a - b;
        return i;
    }

    public static double subtr(long a, long b) {
        long i = a - b;
        return i;
    }

    public static double subtr(double a, double b) {
        double i = a - b;
        return i;
    }

    public static double subtr(double a, int b) {
        double i = a - b;
        return i;
    }

    public static double subtr(int a, double b) {
        double i = a - b;
        return i;
    }

    public static double subtr(double a, long b) {
        double i = a - b;
        return i;
    }

    public static double subtr(long a, double b) {
        double i = a - b;
        return i;
    }

    //умножение
    public static double multi(int a, int b) {
        int i = a * b;
        return i;
    }

    public static double multi(long a, int b) {
        long i = a * b;
        return i;
    }

    public static double multi(int a, long b) {
        long i = a * b;
        return i;
    }

    public static double multi(long a, long b) {
        long i = a * b;
        return i;
    }

    public static double multi(double a, double b) {
        double i = a * b;
        return i;
    }

    public static double multi(double a, int b) {
        double i = a * b;
        return i;
    }

    public static double multi(int a, double b) {
        double i = a * b;
        return i;
    }

    public static double multi(double a, long b) {
        double i = a * b;
        return i;
    }

    public static double multi(long a, double b) {
        double i = a * b;
        return i;
    }

    //деление
    public static double div(int a, int b) throws ArithmeticException {
        double i = 0;
        if (b != 0){
            i = a / b;
            return i;
        } else {
            throw new ArithmeticException("Деление на ноль!");
        }
    }

    public static double div(long a, int b) throws ArithmeticException {
        double i = 0;
        if (b != 0){
            i = a / b;
            return i;
        } else {
            throw new ArithmeticException("Деление на ноль!");
        }
    }

    public static double div(int a, long b) throws ArithmeticException {
        double i = 0;
        if (b != 0){
            i = a / b;
            return i;
        } else {
            throw new ArithmeticException("Деление на ноль!");
        }
    }

    public static double div(long a, long b) throws ArithmeticException {
        double i = 0;
        if (b != 0){
            i = a / b;
            return i;
        } else {
            throw new ArithmeticException("Деление на ноль!");
        }
    }

    public static double div(double a, double b) throws ArithmeticException {
        double i = 0;
        if (b != 0){
            i = a / b;
            return i;
        } else {
            throw new ArithmeticException("Деление на ноль!");
        }
    }

    public static double div(double a, int b) throws ArithmeticException {
        double i = 0;
        if (b != 0){
            i = a / b;
            return i;
        } else {
            throw new ArithmeticException("Деление на ноль!");
        }
    }

    public static double div(int a, double b) throws ArithmeticException {
        double i = 0;
        if (b != 0){
            i = a / b;
            return i;
        } else {
            throw new ArithmeticException("Деление на ноль!");
        }
    }

    public static double div(double a, long b) throws ArithmeticException {
        double i = 0;
        if (b != 0){
            i = a / b;
            return i;
        } else {
            throw new ArithmeticException("Деление на ноль!");
        }
    }

    public static double div(long a, double b) throws ArithmeticException {
        double i = 0;
        if (b != 0){
            i = a / b;
            return i;
        } else {
            throw new ArithmeticException("Деление на ноль!");
        }
    }

}
