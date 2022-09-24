import java.util.Scanner;

public class AllPermutations {
    public static void main(String[] args) {
        /*
         * we can solve this question using the iterative method
         * step1: take the length of the array.
         * divide the numbers from 0 to the factorial of the number.
         * and print the numbers
         */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution(str);
    }

    public static void solution(String str) {
        int length = str.length();
        int fact = Factorial(length);

        for (int i = 0; i < fact; i++) {
            int temp = i;
            StringBuilder sb = new StringBuilder(str);
            for (int j = length; j >= 1; j--) {
                int quet = temp / j;
                int rem = temp % j;

                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);

                temp = quet;
            }
            System.out.println();
        }
    }

    public static int Factorial(int num) {
        // base case
        if (num == 1) {
            return 1;
        }
        return num * Factorial(num - 1);
    }
}
