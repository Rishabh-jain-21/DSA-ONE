import java.util.Scanner;

public class NonRepeatingElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        /*
         * so here we can do this using three methods
         * 1) use nested loops and check for the each element weather the element is
         * present
         * or not.
         * Time Complexity: here the TC. Would be O(n^2).
         * 
         * 2) use hashmaps to check for the same.
         * Time Complexity: here the TC. Would be O(n). but we are using extra space so
         * space
         * complexity would increase.
         * 
         * 3) in the third case we will use xor operator which will give us the result.
         * Time Complexity: here the TC. would be O(n) and no extra space is used.
         */

        int result = 0;
        for (int k : arr) {
            result = result ^ k;
        }

        System.out.print(result);
        sc.close();
    }
}
