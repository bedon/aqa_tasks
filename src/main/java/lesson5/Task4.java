package lesson5;

import java.util.Random;

public class Task4 {

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(9);
        }

        for (int i : arr)
            System.out.print(i + " ");


        System.out.println();

        int number;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            number = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            System.out.println( number + " = " + count);
            count = 0;
        }
    }
}
