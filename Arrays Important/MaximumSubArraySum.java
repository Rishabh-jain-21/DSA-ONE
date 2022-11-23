public class MaximumSubArraySum {
    public static void main(String[] args) {
        int arr[] = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        kadanesAlgo(arr);
    }

    private static void kadanesAlgo(int[] a) {
        int sum = 0;
        int maxSum = 0;
        int i = 0;
        while (i < a.length) {

            maxSum = sum > maxSum ? sum : maxSum;

            if (sum < 0) {
                sum = 0;
            }

            sum += a[i];
            i++;
        }
        System.out.print(maxSum);
    }
}