package lesson6;

public class Task2 {

    public static void main(String[] args) {
        try {
            System.out.println(divideByZero());
        } catch (ArithmeticException e) {
            System.out.println("Не можно делить на 0");
        }
    }

    public static int divideByZero() {
        int a = 5;
        int b = 0;
        return a / b;
    }
}
