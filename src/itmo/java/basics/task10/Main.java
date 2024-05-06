package itmo.java.basics.task10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    //1
    public static List<String> readStings(String path) {
        String tempString;
        List<String> readStrings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((tempString = reader.readLine()) != null) {
                readStrings.add(tempString);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return readStrings;
    }

    //2
    public static void writeString(String string, String path) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            bufferedWriter.append(string);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    //3
    public static void mergeFiles(String path1, String path2, String resultPath) {
        List<String> strings1 = readStings(path1);
        List<String> strings2 = readStings(path2);
        strings1.addAll(strings2);
        StringBuilder mergedContent = new StringBuilder();
        for (String line : strings1) {
            mergedContent.append(line).append("\n");
        }
        writeString(mergedContent.toString(), resultPath);
    }

    //4
    public static void changeCharsTo$(String path) {
        List<String> strings1 = readStings(path);
        StringBuilder modifiedContent = new StringBuilder();
        for (String line : strings1) {
            String modifiedLine = line.replaceAll("[^a-zA-Z0-9]", "\\$");
            modifiedContent.append(modifiedLine).append("\n");
        }
        writeString(modifiedContent.toString(), path);
    }

    public static void main(String[] args) {
        System.out.println("task1:");
        for (String i : readStings("./file//Do I Wanna.txt")) {
            System.out.println(i);
        }
        System.out.println("task2:");
        writeString("spillin' drinks on my settee", "./file//Know.txt");
        for (String i : readStings("./file//Know.txt")) {
            System.out.println(i);
        }
        System.out.println("task3:");
        mergeFiles("./file//Do I Wanna.txt", "./file//Know.txt", "./file//by Arctic Monkeys.txt");
        for (String i : readStings("./file//by Arctic Monkeys.txt")) {
            System.out.println(i);
        }
        System.out.println("task4:");
        changeCharsTo$("./file//by Arctic Monkeys.txt");
        for (String i : readStings("./file//by Arctic Monkeys.txt")) {
            System.out.println(i);
        }
    }
}
