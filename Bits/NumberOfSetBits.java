import java.util.Scanner;

public class NumberOfSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        /*
         * in the first method we will find the number of set bits by shifting the every
         * bit to the right and checking the last bit by performing & operator on the
         * below code.
         * the time complexity will depend on the number of bits in the digit.
         */

        int count = 0;
        while (num != 0) {
            if ((num & 1) != 0) {
                count++;
            }
            num = num >> 1;
        }

        System.out.println(count);

        /*
         * in the second method we will do this by using the logic (n & (n-1))
         * this particular logic is used to make the most significant set bit as zero
         * time complexity would be the number of significant bits in the digit.
         */

        int count1 = 0;
        while (num != 0) {
            num = num & (num - 1);
            count++;
        }
        System.out.println(count1);

        sc.close();
    }
}
