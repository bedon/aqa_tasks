package lesson5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(Days.values()));
    }
}

enum Days {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}
