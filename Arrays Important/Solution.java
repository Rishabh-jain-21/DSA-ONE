public class Solution {

    public static long[] nextLargerElementBFS(long[] arr, int n) {
        long ans[] = new long[n];
        int k = 0;
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            for (; j < n; j++) {
                if (arr[i] < arr[j]) {
                    ans[k++] = arr[j];
                    break;
                }
            }
            if (j == n) {
                ans[k++] = -1;
            }
        }
        ans[k++] = -1;
        return ans;
    }

    public static void main(String args[]) {
        // long[] arr = new long[] { 1, 3, 2, 4 };
        long[] arr = new long[] { 6, 8, 0, 1, 3 };
        long ans[] = nextLargerElementBFS(arr, arr.length);
        for (long k : ans) {
            System.out.print(k + " ");
        }
    }
}