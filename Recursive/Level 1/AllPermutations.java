import java.util.List;
import java.util.ArrayList;

public class AllPermutations {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3 };
        List<List<Integer>> ans = permuteAll(arr);
        System.out.println(ans);
    }

    private static List<List<Integer>> permuteAll(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[arr.length];
        helper(arr, ds, freq, ans);
        return ans;
    }

    private static void helper(int[] arr, List<Integer> ds, boolean[] freq, List<List<Integer>> ans) {

        // base case
        if (ds.size() == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(arr[i]);
                helper(arr, ds, freq, ans);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }
}