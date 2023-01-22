import java.util.*;

class MergeIntervals {

    private static void merge(int[][] arr) {
        Stack<int[]> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                st.push(new int[] { arr[0][0], arr[0][1] });
            } else {
                int last[] = st.peek();
                if (arr[i][0] > last[1]) {
                    st.push(new int[] { arr[i][0], arr[i][1] });
                } else {
                    int temp[] = st.pop();
                    temp[1] = Math.max(temp[1], arr[i][1]);
                    st.push(temp);
                }
            }
        }
        // print(st);
        Stack<int[]> ans = new Stack<>();
        while (!st.isEmpty()) {
            ans.push(st.pop());
        }

        int temp[][] = new int[ans.size()][2];
        int i = 0;
        while (!ans.isEmpty()) {
            temp[i] = ans.pop();
        }
    }

    private static void print(Stack<int[]> ss) {
        if (ss.isEmpty()) {
            return;
        }
        int ans[] = ss.pop();
        print(ss);
        System.out.println(ans[0] + ", " + ans[1]);
    }

    public static void main(String[] args) {
        // int arr[][] = new int[][] { { 1, 5 }, { 6, 9 }, { 9, 14 }, { 10, 13 }, { 15,
        // 17 } };
        int arr[][] = new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

        merge(arr);
    }
}