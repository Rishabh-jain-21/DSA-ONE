import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int ans = 0;
        int i = 0;

        while (num > 0) {
            int rem = num % 2;
            num = num / 2;

            ans = (int) (rem * Math.pow(10, i) + ans);
            i++;
        }
        System.out.print(ans + " ");

        sc.close();
    }
}
