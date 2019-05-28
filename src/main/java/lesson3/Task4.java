package lesson3;

public class Task4 {

    public static void main(String[] args) {
        int[] arr = new int[] {1,1,3,1,1,3,1,1,1,1};
        int sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
             sum += arr[i];
        }

        System.out.println(sum);
    }
}
