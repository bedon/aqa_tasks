package lesson3;

public class Task1 {

    public static void main(String[] args) {

        for (int i = 10; i <= 20 ; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        int a = 10;
        while (a <= 20) {
            System.out.print(a + " ");
            a++;
        }

        System.out.println();

        int b = 10;
        do {
            System.out.print(b + " ");
            b++;
        } while (b <=20);
    }
}
