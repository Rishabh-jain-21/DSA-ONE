import java.util.Arrays;

public class MissingAndRepeatingNumber {

    private static void UsingXor(int[] arr) {
        int i = 0, x = 0, y = 0, xor = 0;

        // So here we will use XOR Operator in which we will find the XOR of the Array
        // and the Numbers from 1-N.

        for (i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }

        for (i = 1; i <= arr.length; i++) {
            xor = xor ^ i;
        }

        /*
         * now here we will find the most significant bit of the xor and make two
         * partitions one with the same significant and other with differenet
         * significant bit
         */
        int msb = xor & ~(xor - 1);
        for (i = 0; i < arr.length; i++) {
            if ((msb & arr[i]) != 0) {
                x = x ^ arr[i];
            } else {
                y = y ^ arr[i];
            }
        }
        for (i = 1; i <= arr.length; i++) {
            if ((msb & i) != 0) {
                x = x ^ i;
            } else {
                y = y ^ i;
            }
        }
        System.out.println(x + " " + y);
    }

    private static void Hashing(int[] arr) {
        // using hashing will solve the problem in tc O(n) and sc O(n)
        int hash[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] = hash[arr[i]] + 1;
        }
        for (int i = 1; i < hash.length; i++) {
            if (hash[i] == 0) {
                System.out.println("Missing Number : " + i);
            } else if (hash[i] == 2) {
                System.out.println("Repeated Number: " + i);
            }
        }
    }

    private static void Sorting(int[] arr) {
        // using sorting (n * log(n)) + iteration twice 2(N)
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != 1 && arr[i] != arr[i + 1]) {
                System.out.print("Missing Number : " + (arr[i] + 1));
            }
            if (arr[i] == arr[i + 1]) {
                System.out.println("Repeating Number : " + arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 6, 2, 4, 5, 6 };
        // Sorting(arr);
        // Hashing(arr);
        UsingXor(arr);
    }
}
