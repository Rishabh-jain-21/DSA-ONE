import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.print(factorial(a));
        sc.close();
    }

    static int factorial(int num) {
        // base case
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
