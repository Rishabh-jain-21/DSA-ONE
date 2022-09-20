/*
 * 1. You are given a square matrix of size 'n'. You are given n*n elements of
 * the square matrix.
 * 2. You are required to find the saddle price of the given matrix and print
 * the saddle price.
 * 3. The saddle price is defined as the least price in the row but the maximum
 * price in the column of the matrix.
 */

import java.util.*;

public class SaddlePrice {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        // never forgot to take input idiot
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // brute force
        for (int i = 0; i < arr.length; i++) {
            int minInRow = Integer.MAX_VALUE;
            int minCol = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (minInRow > arr[i][j]) {
                    minInRow = arr[i][j];
                    minCol = j;
                }
            }
            for (int k = 0; k < arr.length; k++) {
                if (minInRow < arr[k][minCol]) {
                    break;
                }
                if (k == arr.length - 1) {
                    System.out.print(minInRow);
                }
            }
            // check for the maximum for that column

        }

    }
}