class Sorting {

    void Merge(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            Merge(arr, start, mid);
            Merge(arr, mid + 1, end);
            MergeSort(arr, start, mid, end);
        }
    }

    private static void MergeSort(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = 0;
        int temp[] = new int[end - start + 1];
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }
        i = start;
        for (int elm : temp) {
            arr[i++] = elm;
        }
    }
}

public class SortTwoArrays {

    private static void usingMostOptimizedApproach(int[] a, int[] b) {
        int length = (int) Math.ceil((a.length + b.length) / 2);
        int i = 0;
        while (i < a.length) {

        }
    }

    private static void withoutUsingExtraSpace(int[] a, int[] b) {
        Sorting sort = new Sorting();
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                int swap = a[i];
                a[i] = b[j];
                b[j] = swap;
                j = 0;
                sort.Merge(b, 0, b.length - 1);
            } else {
                i++;
            }
        }
    }

    private static void usingExtraSpace(int[] a, int[] b) {
        int na[] = new int[a.length + b.length];
        int i = 0, k = 0;
        for (i = 0; i < a.length; i++) {
            na[k++] = a[i];
        }
        for (i = 0; i < b.length; i++) {
            na[k++] = b[i];
        }
        Sorting sort = new Sorting();
        sort.Merge(na, 0, na.length - 1);

        for (int elm : na) {
            System.out.print(elm + " ");
        }
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 5, 7, 9, 11 };
        int b[] = { 3, 4, 6, 8, 10 };

        // usingExtraSpace(a, b);
        // withoutUsingExtraSpace(a, b);

        usingMostOptimizedApproach(a, b);

        print(a, b);
    }

    private static void print(int[] a, int[] b) {
        for (int k : a) {
            System.out.print(k + " ");
        }
        for (int k : b) {
            System.out.print(k + " ");
        }
    }
}
