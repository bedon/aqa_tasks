package lesson3;

import java.math.BigInteger;

public class Task7 {

    public static int getGreatestCommonDivisor (int first, int second) {
        if (first<10 || second<10) {
            return -1;
        }

        BigInteger b1 = BigInteger.valueOf(first);
        BigInteger b2 = BigInteger.valueOf(second);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }

    public static void main(String[] args) {
        int result = getGreatestCommonDivisor(36, 90);
        System.out.println(result);
    }
}
