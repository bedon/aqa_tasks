package lesson5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task9 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random()*100)+1);
        }

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }

        for (int i : set)
            System.out.print(i + " ");
    }
}
