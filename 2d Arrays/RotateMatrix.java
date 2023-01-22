// rotate a 2d matrix in anti-clockwise direction
public class RotateMatrix {
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        rotate(mat, mat.length);
        displayMatrix(mat.length, mat);
    }

    static void displayMatrix(int N, int mat[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + mat[i][j]);

            System.out.print("\n");
        }
        System.out.print("\n");
    }

    private static void rotate(int[][] arr, int N) {
        // taking the transpose of the matrix
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if (i != j) {
                    swap(arr, i, j);
                }
            }
        }

        // for anticlockwise we will simply reverse columns of the transposed array.
        for (int i = 0; i < N; i++) {
            reverse(arr, i, 0, N - 1);
        }

        /*
         * Note: bhai dekh agar anticlockwise hai to column ko reverse karde (upar se
         * niche) clockwise hai to rows ko reverse karde(left to right)
         */
    }

    private static void swap(int[][] arr, int i, int j) {
        int swap = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = swap;
    }

    private static void reverse(int[][] arr, int f, int i, int j) {
        while (i < j) {
            int swap = arr[i][f];
            arr[i][f] = arr[j][f];
            arr[j][f] = swap;
            i++;
            j--;
        }
    }
}