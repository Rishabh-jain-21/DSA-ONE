public class powerOfXN {
    public static void main(String[] args) {
        int x = 5;
        int y = 1;
        int ans = powerBFS(x, y);
        int ans2 = powerOpt(x, y);
        System.out.println(ans + "  " + ans2);
    }

    /*
     * in brute force there is no doubt that it will simply multiply the following
     * number n time to get the desigred output
     */
    private static int powerBFS(int x, int y) {
        int ans = 1;
        for (int i = 0; i < y; i++) {
            ans *= x;
        }
        return ans;
    }

    // lets talk about the optimal approach we will simply iterate the number n/2
    // times to get the desigred output.

    private static int powerOpt(int x, int y) {
        int ans = 1;
        while (y >= 1) {
            if (y % 2 != 0) {
                ans = ans * x;
            } else {
                x = x * x;
            }
            y = y / 2;
        }
        return ans;
    }
}
