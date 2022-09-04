
// find the ith bit as zero or one
import java.util.Scanner;

public class FindBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        int num = sc.nextInt();
        System.out.println("Enter ith bit");
        int ith_bit = sc.nextInt();

        /****
         * let us do bit masking
         * we will simply create a mask by left shifting the one ith times result as
         * lets suppose we have to find the 3rd bit for number 55. After that we will
         * use & operator on the number and mask, if the result show us zero the 3rd
         * bit will be zero else it will be non zero
         * number -> 1 1 0 1 1 1
         * mask -> 0 0 1 0 0 0
         * & -> 0 0 0 0 0 0
         ****/
        int mask = 1 << ith_bit;
        System.out.print((mask & num) != 0 ? '1' : '0');
        sc.close();
    }
}