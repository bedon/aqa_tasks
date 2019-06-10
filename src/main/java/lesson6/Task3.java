package lesson6;

public class Task3 {

    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);

        try {
            int b = 10 / a;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }

        try {
            int[] c = {1};
            System.out.println(c[1]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }

    }
}

