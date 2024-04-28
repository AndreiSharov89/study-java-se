package itmo.java.basics.task5;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            String str;
            String sub;

            //1
            System.out.println("Ищем самое длинное слово");
            System.out.print("Введите текст: ");
            String word = longestWord(getWord());
            System.out.println("Самое длинное слово: " + word + ", длина " + word.length());
            //2
            System.out.println("Определяем полидромность");
            System.out.print("Введите слово: ");
            str = getWord().trim();
            if (str.contains(" ") || str.length() == 0 || !str.matches("\\p{L}+"))
                System.out.println("Введено не слово!");
            else
                System.out.println("Полиндром: " + isPolyndrom(str));
            // 3
            System.out.println("Цензурируем");
            System.out.print("Введите текст: ");
            str = getWord();
            System.out.println("Цензурированная версия: " + censorship(str));
            // 4
            System.out.println("Считаем вхождения");
            System.out.print("Введите текст: ");
            str = getWord();
            System.out.print("\nВведите подстроку: ");
            sub = getWord();
            System.out.print("\nРезультат: ");
            if (sub.length() == 0 || str.length() == 0)
                System.out.println("Некорректные параметры");
            else {
                System.out.println(substringCount(str, sub));
            }
            // 5
            System.out.println("Инвертурем, судя по заданию, буквы в каждом слове");
            System.out.print("Введите текст: ");
            str = getWord();
            System.out.println("\nРеверсированый текст: " + reverseWords(str));
        }

        public static String getWord() {
            Scanner scan = new Scanner(System.in);
            return scan.nextLine();
        }

        public static String longestWord(String str) {
            if (str.length() > 0) {
                int size = 0;
                String res = "";
                str = str.replaceAll("[\\p{P}\\p{S}\\p{Digit}]", "");
                for (String s : str.split(" ")) {
                    if (size < s.length()) {
                        size = s.length();
                        res = s;
                    }
                }
                return res;
            }
            return " Empty String!";
        }

        public static boolean isPolyndrom(String s) {
            StringBuilder buf = new StringBuilder(s.trim().toLowerCase());
            return (s.trim().toLowerCase().equals(buf.reverse().toString()));
        }

        public static String censorship(String s) {
            return s.replaceAll("бяка", "[вырезано цензурой]");
        }

        public static int substringCount(String str, String sub) {
            if (sub.length() > str.length()) return 0;
            String[] temp = str.split(sub);
            if (temp.length > 1) {
                return temp.length;
            }
            return 0;
        }

        public static String reverseWords(String str) {
            String[] temp = str.split(" ");
            StringBuilder res = new StringBuilder();
            for (String s : temp) {
                StringBuilder buf = new StringBuilder();
                res.append(buf.append(s).reverse()).append(" ");
            }
            return String.valueOf(res);
        }
    }

