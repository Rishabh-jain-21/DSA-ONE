import java.util.Arrays;

public class Sort_0_1_2 {

    static void DutchNationalFlag(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int swap = arr[mid];
                arr[mid] = arr[low];
                arr[low] = swap;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                int swap = arr[high];
                arr[high] = arr[mid];
                arr[mid] = swap;
                high--;
            }
            System.out.println();
            print(arr);
        }

    }

    static int[] CountNumbers(int[] arr) {
        // this will use O(3N) and O(1)
        int countZ = 0;
        int countO = 0;
        int countT = 0;
        for (int k : arr) {
            if (k == 0)
                countZ++;
            else if (k == 1)
                countO++;
            else if (k == 2)
                countT++;
        }
        int j = 0;
        for (int i = 0; i < countZ; i++) {
            arr[j++] = 0;
        }
        for (int i = 0; i < countO; i++) {
            arr[j++] = 1;
        }
        for (int i = 0; i < countT; i++) {
            arr[j++] = 2;
        }
        return arr;
    }

    public static void UsingBasicSort(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 0, 2, 1, 2, 0, 1, 0 };

        // UsingBasicSort(arr);
        // int a[] = CountNumbers(arr);
        DutchNationalFlag(arr);
        // print(a);
    }

    static void print(int[] ar) {
        for (int k : ar) {
            System.out.print(k + " ");
        }
    }
}