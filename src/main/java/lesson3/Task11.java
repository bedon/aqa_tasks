package lesson3;

public class Task11 {
    public static void main(String[] args) {

        int lineNumber = 10;
        int star = 1;
        int space = lineNumber;
        for (int i = 0; i < lineNumber; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            star += 2;
            space--;
            System.out.println();
        }
    }
}
