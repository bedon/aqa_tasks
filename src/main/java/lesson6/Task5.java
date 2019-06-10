package lesson6;

public class Task5 {

    public static void main(String[] args) {
        try {
            iCanThrowException();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void iCanThrowException() {
        throw new NullPointerException();
    }
}
