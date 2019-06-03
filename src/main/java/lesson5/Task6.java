package lesson5;

import java.util.ArrayList;

public class Task6 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("asd1");
        list.add("asd223");
        list.add("asd");
        list.add("asd423231");
        list.add("asd423232");
        list.add("asd523");
        list.add("asd15");
        list.add("a");
        list.add("asd");
        list.add("asd4232");
        list.add("asd523");

        String longest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > longest.length()) {
                longest = list.get(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == longest.length()) {
                System.out.println(list.get(i));
            }
        }
    }
}
