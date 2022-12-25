import java.util.ArrayList;
import java.util.List;

public class AllPermutations2 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3 };
        List<List<Integer>> list = new ArrayList<>();
        permute(0, arr, list);
        System.out.println(list);
    }

    private static void permute(int index, int[] arr, List<List<Integer>> ans) {
        // base case
        if (index == arr.length) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
            ans.add(list);
        }
        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            permute(index + 1, arr, ans);
            swap(arr, index, i);
        }
    }

    private static void swap(int a[], int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
