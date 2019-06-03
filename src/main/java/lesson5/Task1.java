package lesson5;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("asd1");
        list.add("asd2");
        list.add("asd3");
        list.add("asd4");
        list.add("asd5");

        for (String s : list)
            System.out.println(s);
    }
}
