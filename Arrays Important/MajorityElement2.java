/*
 * in this question we will simply find the number having occurance more than n/3 times.
 */

public class MajorityElement2 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 2, 2, 1, 2, 3, 3, 3, 1 };
        MooreVotingAlgo(arr);
    }

    private static void MooreVotingAlgo(int[] a) {
        int elm1 = -1;
        int elm2 = -1;
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (cnt1 == 0) {
                elm1 = a[i];
                cnt1 = 1;
            } else if (cnt2 == 0) {
                elm2 = a[i];
                cnt2 = 1;
            } else if (elm1 == a[i]) {
                cnt1++;
            } else if (elm2 == a[i]) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        System.out.println(elm1 + " " + elm2);
    }
}
