package lesson3;

public class Task6 {

    public static int getEvenDigitSum(int a) {
        if (a < 0) {
            return -1;
        }

        int result = 0;
        String s = Integer.toString(a);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
        {
            arr[i] = s.charAt(i) - '0';
            if (arr[i] % 2 == 0)
                result++;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = getEvenDigitSum(4256122);
        System.out.println(result);
    }
}
