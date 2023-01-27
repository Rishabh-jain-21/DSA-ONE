import java.util.Scanner;
// condition for inversion is : where i < j and arr[i] > arr[j]
/* we can count the inversions using two methods first one is brute force which is simply got all the inversions and then count 
 * 
 * second onc is we can simply do with the help of the merge sort problem here what we can found is that in merge sort if the elements at the left array is greated than the right arary than all the elements in the left array will we greater than the right array we will use this logic simply in merge sort to get the desired result
*/

public class CountInversion {

    private static int Merge(int[] arr, int s, int m, int e) {
        int i = s;
        int j = m + 1;
        int ans[] = new int[e - s + 1];
        int k = 0;
        int count = 0;

        while (i <= m && j <= e) {
            if (arr[i] <= arr[j]) {
                ans[k++] = arr[i++];
            } else {
                ans[k++] = arr[j++];
                count += m - i + 1;
            }
        }
        while (i <= m) {
            ans[k++] = arr[i++];
        }
        while (j <= e) {
            ans[k++] = arr[j++];
        }

        for (int ko : ans) {
            arr[s++] = ko;
        }
        return count;
    }

    private static int usingMergesort(int[] arr, int s, int e) {
        int count = 0;
        if (s < e) {
            int mid = (s + e) / 2;
            count += usingMergesort(arr, s, mid);
            count += usingMergesort(arr, mid + 1, e);
            count += Merge(arr, s, mid, e);
        }
        return count;
    }

    private static int bruteForce(int a[]) {
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int[] input() {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int arr[] = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = input();
        // System.out.print(bruteForce(arr));
        int ans = usingMergesort(arr, 0, arr.length - 1);
        System.out.println(ans);
    }
}
