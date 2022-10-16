import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int ans = reverse(num);
        System.out.println(ans);
    }

    static int reverse(int num) {
        // base case
        if (num % 10 == num) {
            return num;
        }

        int ans = reverse(num / 10);
        int pow = (int) Math.log10(num) + 1;
        ans = (int) ((num % 10 * Math.pow(10, pow - 1)) + ans);
        return ans;
    }
}