import java.util.Scanner;

public class TwoNonRepeatingElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        logic(arr);
    }

    public static void logic(int[] arr) {
        /*
         * firstly we will apply xor(^) operator all over the loop and get the xor of
         * the
         * two non repeating numbers.
         * arr - 5 2 3 4 5 4
         * we will get the xor of the 2^3
         * 
         */

        int result = 0;
        for (int k : arr) {
            result = result ^ k;
        }

    }
}
