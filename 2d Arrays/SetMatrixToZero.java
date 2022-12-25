// import java.util.Scanner;

public class SetMatrixToZero {
    public static void main(String[] args) {

        // lets take the hardcoded input

        int arr[][] = new int[][] { { 1, 0, 0, 9 }, { 3, 5, 1, 4 }, { 5, 0, 8, 1 }, { 8, 9, 8, 1 }, { 9, 7, 1, 1 } };
        // int arr[][] = new int[][] { {} };

        // bfs(arr);

        print(arr);

        System.out.println();

        bfs2(arr);
        print(arr);
    }

    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void bfs(int matrix[][]) {
        // boolean flag = false;
        // int row = 0, column = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int row[] = new int[n * m];
        int col[] = new int[n * m];
        int iterator = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[iterator] = i;
                    col[iterator] = j;
                    iterator++;
                }
            }
        }

        for (int i = 0; i < iterator; i++) {
            for (int k = 0; k < m; k++) {
                matrix[row[i]][k] = 0;
            }
            for (int k = 0; k < n; k++) {
                matrix[k][col[i]] = 0;
            }
        }
    }

    public static void bfs2(int[][] matrix) {
        /*
         * let us suppose that we dont have any kind of -ve values in the matrix.
         * so we will replace all the zero containing digits with the -1 and traverese
         * again the matrix just to replce -1 with zero again.
         */

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < matrix[i].length; k++) {
                        matrix[i][k] = matrix[i][k] == 0 ? 0 : -1;
                    }
                    for (int k = 0; k < matrix.length; k++) {
                        matrix[k][j] = matrix[k][j] == 0 ? 0 : -1;
                    }
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}