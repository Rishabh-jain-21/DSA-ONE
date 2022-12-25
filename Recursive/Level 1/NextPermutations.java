import java.util.List;
import java.util.ArrayList;

public class NextPermutations {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4 };
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean freq[] = new boolean[arr.length];
        /*
         * first of all we will find all of the permutations and then we will find its
         * nextPermutation
         */
        permutations(arr, list, ans, freq);
        // System.out.println(ans);
        nextPermute(ans);
    }

    static void permutations(int[] arr, List<Integer> list, List<List<Integer>> ans, boolean[] freq) {
        // base case

        if (list.size() == arr.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                list.add(arr[i]);
                permutations(arr, list, ans, freq);
                list.remove(list.size() - 1);
                freq[i] = false;
            }
        }

    }

    static void nextPermute(List<List<Integer>> list) {
        List<Integer> next = new ArrayList<>();
        next.add(4);
        next.add(3);
        next.add(2);
        next.add(1);

        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(next)) {
                index = i;
                break;
            }
        }
        if (index == list.size() - 1) {
            System.out.println(list.get(0));
        } else {
            System.out.println(list.get(index + 1));
        }
    }
}