class NextPermutation {

    private static void print(int[] a) {
        for (int k : a) {
            System.out.println(k + " ");
        }
    }

    public static void nextPermutation(int[] nums) {
        // check for the edge case
        if (nums.length == 1 || nums == null) {
            return;
        }
        int i = nums.length - 2;
        // check for the number breaking the incerasing sequnce from the last.
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);
    }

    private static void swap(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    private static void reverse(int[] a, int i, int j) {
        while (i < j) {
            swap(a, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 4, 3 };
        nextPermutation(a);
        print(a);
    }
}