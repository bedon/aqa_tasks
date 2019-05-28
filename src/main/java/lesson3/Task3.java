package lesson3;

public class Task3 {

    public static void main(String[] args) {
        int[] array = new int[101];

        for (int i = 0; i < array.length ; i++) {
            array[i] = array.length - i - 1;
        }

        for (int i : array)
            System.out.print(i + " ");
    }
}
