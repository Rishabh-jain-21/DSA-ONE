import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int ans = slowPow(a, b);

        int ans = fastPow(a, b);
        System.out.println(ans);
        sc.close();
    }

    // this fxn will solve the given code in O(N)
    static int slowPow(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return x * slowPow(x, y - 1);
    }

    // this fxn will solve the given code in O(logn)

    static int fastPow(int x, int y) {
        // base case
        if (y == 0) {
            return 1;
        }
        int ans = fastPow(x, y / 2);
        int finalAns = ans * ans;
        if (y % 2 == 1) {
            finalAns *= x;
        }
        return finalAns;
    }

}
