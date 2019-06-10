package lesson6;

import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        Scanner sc = new Scanner(System.in);

        String s = "go";
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (!s.equals("stop")) {
            System.out.println("Enter nummber");
            try {
                int number = sc.nextInt();
                list.add(number);
            } catch (Exception e) {
                s = "stop";
                for (int i : list)
                    System.out.println(i);
            }
        }
    }
}
