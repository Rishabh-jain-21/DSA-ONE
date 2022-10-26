import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumber {

    static void LinkedListCycleMethod(int[] arr) {
        // this would be the most optimized approach using list iterating method with
        // O(N) tc
        int slow = arr[0];
        int fast = arr[0];

        while (slow != fast) {
            slow = arr[slow];
            fast = arr[arr[fast]];
        }

        fast = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        System.out.println(slow);
    }

    static void UsingHashSet(int[] arr) {
        // in this case we are going to use data structure with tc O(n) and sc as O(n)
        Set<Integer> set = new HashSet<>();

        arr[1] = Integer.MAX_VALUE;
        boolean flag = false;
        int i = 0;
        while (!set.contains(arr[i])) {
            if (i == arr.length - 1) {
                flag = true;
                break;
            }
            set.add(arr[i]);
            i++;
        }
        if (flag)
            System.out.println("Not present");
        else
            System.out.println(arr[i]);

    }

    static void UsingHashing(int[] arr) {
        /*
         * this would be the optimized case where we will use hashing and do it in O(N)
         * tc and O(N) sc
         */
        int hash[] = new int[1000000];
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (hash[arr[i]] != 0) {
                System.out.println(arr[i]);
                flag = false;
                break;
            }
            hash[arr[i]] = 1;
        }
        if (flag) {
            System.out.println("Not Present");
        }
    }

    static void UsingSorting(int[] arr) {
        // this would be a liitle optimized basic approach which use sorting O(n * logn)
        // 1 2 2 3 4 5

        Arrays.sort(arr);
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Not present");
        }
    }

    static void DoubleIteration(int[] arr) {
        // this would be the most basic approach using n^2 tc iterating the array twice
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("Elemen/Number is not presents");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 2, 5, 2, 3, 4, 1 };
        // int arr[] = new int[] { 1, 1 };
        // int arr[] = new int[] { 1, 2, 3, 4 };
        // int arr[] = new int[] {};

        // DoubleIteration(arr);
        // UsingSorting(arr);
        // UsingHashing(arr);
        // UsingHashSet(arr);
        LinkedListCycleMethod(arr);
    }
}