package lesson3;

public class Task9 {

    public static void main(String[] args) {

        int s = 1;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print("*");
            }
            s++;
            System.out.println();
        }
    }
}
