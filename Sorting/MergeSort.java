public class MergeSort {

    static void print(int[] arr) {
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    static void MergeSort(int[] arr, int start, int mid, int end) {
        int narr[] = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                narr[k] = arr[i];
                i++;
            } else {
                narr[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            narr[k] = arr[i];
            i++;
            k++;
        }
        while (j <= end) {
            narr[k] = arr[j];
            j++;
            k++;
        }

        int l = 0;
        for (int tempo : narr) {
            arr[start++] = tempo;
        }
    }

    static void merge(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            merge(arr, start, mid);
            merge(arr, mid + 1, end);
            MergeSort(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 3, 4, 1, 6, 5, 2 };
        merge(arr, 0, arr.length - 1);
        print(arr);
    }

}
