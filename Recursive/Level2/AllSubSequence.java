import java.util.ArrayList;

public class AllSubSequence {
    public static void main(String[] args) {
        int[] ar = new int[] { 1, 2, 3, 4 };
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        boolean[] flag = new boolean[ar.length];
        getSubsequence(ar, list, flag, new ArrayList<>());

        System.out.print(list);
    }

    private static void getSubsequence(int[] arr, ArrayList<ArrayList<Integer>> list, boolean[] flag,
            ArrayList<Integer> ls) {

        // base case
        if (arr.length == ls.size()) {
            list.add(new ArrayList<>(ls));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            // flag of i is defined as false of if it is !false which is true we will go for
            // that.
            if (!flag[i]) {
                flag[i] = true;
                ls.add(arr[i]);
                getSubsequence(arr, list, flag, new ArrayList<>(ls));
                ls.remove(ls.size() - 1);
                flag[i] = false;
            }
        }
    }
}