package itmo.java.basics.task2;

import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите операцию вида:\n2\n*\n2\n");
        int a = scanner1.nextInt();
        //long a = scanner1.nextLong();
        //double a = scanner1.nextDouble();
        char sign = scanner2.nextLine().charAt(0);
        int b = scanner3.nextInt();
        //long b = scanner3.nextLong();
        //double b = scanner3.nextDouble();
        double result = 0;

        switch (sign) {
            case ('+'):
                result = Calculator.summ(a, b);
                break;
            case ('-'):
                result = Calculator.subtr(a, b);
                break;
            case ('*'):
                result = Calculator.multi(a, b);
                break;
            case ('/'):
                result = Calculator.div(a, b);
                break;
            default:
                System.out.println("Неправильный ввод");
                break;
        }
        System.out.println("Ответ: " + result);

        NetworkIP4 net = new NetworkIP4();
        NetworkIP4 net1 = new NetworkIP4("1.1.1.1/31");
        NetworkIP4 net2 = new NetworkIP4("1.1.1.1/8");
        NetworkIP4 net3 = new NetworkIP4("192.168.12.25/21");
        NetworkIP4 net4 = new NetworkIP4("2.2.2.2", "255.255.255.254");
        NetworkIP4 net5 = new NetworkIP4("3.3.3.3", "255.0.0.0");
        NetworkIP4 net6 = new NetworkIP4("172.16.20.25", "255.255.248.0");
        System.out.println(net.toString());
        System.out.println(net1.toString());
        System.out.println(net2.toString());
        System.out.println(net3.toString());
        System.out.println(net4.toString());
        System.out.println(net5.toString());
        System.out.println(net6.toString());
    }
}
