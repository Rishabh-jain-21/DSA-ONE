import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3 , 4, 5};
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        boolean[] flag = new boolean[arr.length];

        permute(arr, flag, ans, list);
        System.out.print(list);
    }

    private static void permute(int[] arr, boolean[] flag, List<Integer> ans, List<List<Integer>> list) {
        // base case
        if (ans.size() == arr.length) {
            list.add(new ArrayList<>(ans));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!flag[i]) {
                ans.add(arr[i]);
                flag[i] = true;
                permute(arr, flag, ans, list);
                ans.remove(ans.size() - 1);
                flag[i] = false;
            }
        }
    }
}
