package lesson3;

public class Task5 {

    public static void main(String[] args) {
        System.out.println(min(59,25, 2, 403));
    }

    public static int min(int a, int b, int c, int d) {
        int ab = min(a,b);
        int cd = min(c,d);
        return ab < cd ? ab : cd;
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
