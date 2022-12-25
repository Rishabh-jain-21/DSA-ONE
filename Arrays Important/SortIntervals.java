public class SortIntervals {
    public static void main(String args[]) {
        int arr[][] = new int[][] { { 1, 2 }, { 3, 4 }, { 1, 1 }, { 2, 4 }, { 2, 2 }, { 1, 1 } };

        sort(arr);
        print(arr);
    }

    private static void sort(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j][0] > arr[j + 1][0]) {
                    int[] swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j][1] > arr[j + 1][1] && arr[j][0] == arr[j + 1][0]) {
                    int[] swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
    }

    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("], ");
        }
    }
}
