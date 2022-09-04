/*
 * you have been given two numbers you have to find how many digits should we change to convert
 * one number to the second number.
 */

import java.util.Scanner;

public class NumberOfBitstToChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        /*
         * so first of all we will use xor(^) operator as of we know that xor operator
         * will
         * make the bits with different digits as one
         * 55 - 1 1 0 1 1 1
         * 23 - 0 1 1 0 0 1
         * ^ - 1 0 1 1 1 0 <- result
         * so we get the result here and we will simply find all the set bits in the
         * result
         * and we got the result.
         */

        int result = num1 ^ num2;
        int count = 0;

        /* find the significant bits */
        while (result != 0) {
            result = result & (result - 1); // used to find the most significant bit.
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
