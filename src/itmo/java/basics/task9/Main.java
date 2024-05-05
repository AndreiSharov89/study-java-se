package itmo.java.basics.task9;

import java.util.*;

public class Main {
    public static Collection<Integer> arrListToSet(Collection<Integer> in) {
        return new HashSet<>(in);
    }

    public static void generateList(List<Integer> objects) {
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            objects.add(random.nextInt(1000000));
        }
    }

    public static void pickValues(List<Integer> list) {
        Random random = new Random();
        for (Integer i : list) {
            list.get(random.nextInt(999999));
        }
    }


    public static long timer(List<Integer> List) {
        long start = System.currentTimeMillis();
        generateList(List);
        pickValues(List);
        long stop = System.currentTimeMillis();
        return stop - start;
    }
    public static String getScore(Map<User, Integer> users, String name) {
        for (User u : users.keySet()) {
            if (u.getName().equals(name)) {
                return users.get(u).toString();
            }
        }
        return "Не найден";
    }

    public static void main(String[] args) {
        //task 2
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 2, 21, 3, 33, 3, 4, 1, 44, 444, 21));
        System.out.println("Before: " + arr);
        System.out.println("After: " + arrListToSet(arr));
        //task 3
        ArrayList<Integer> aList = new ArrayList<>();
        System.out.print("Array list time:");
        System.out.println(timer(aList)); //36 ms
        LinkedList<Integer> lList = new LinkedList<>();
        System.out.print("Linked list time:");
        System.out.println(timer(lList)); //6 min 57 sec 470 ms
        //task4
        Scanner scan = new Scanner(System.in);
        User user1 = new User("Кирилл");
        User user2 = new User("Ахмад");
        User user3 = new User("Алексей");
        User user4 = new User("Тихон");
        User user5 = new User("Никита");
        User user6 = new User("Юлия");
        Map<User, Integer> map = new HashMap<User, Integer>();
        map.put(user1, 1109);
        map.put(user2, 228);
        map.put(user3, 333);
        map.put(user4, 4444);
        map.put(user5, 525);
        map.put(user6, 69);
        System.out.print("Введите Имя:");
        String user = scan.nextLine();
        System.out.println("Счет: " + getScore(map, user));
    }
}
