import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1?page=1&curated[]=8&sortBy=submissions
public class Maximumofallsubarraysofsizek {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;
        ArrayList<Integer> list = max_of_subarrays(arr, arr.length, k);
        System.out.println(list);
    }

    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        int max = -1;
        for (int i = 0; i <= n - k; i++) {
            for (int j = i; j < i + k; j++) {
                max = arr[j] > max ? arr[j] : max;
            }
            list.add(max);
        }

        return list;
    }
}
