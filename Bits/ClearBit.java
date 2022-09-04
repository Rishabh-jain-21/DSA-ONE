
/*  find the ith bit and clear the bit --> if the bit is one make it zero else 
do nothing */
import java.util.Scanner;

public class ClearBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        int num = sc.nextInt();
        System.out.println("Enter ith bit");
        int ith_bit = sc.nextInt();

        /****
         * let us do bit masking
         * we will create a mask here by left shifting the 1 ith times
         * Note- we will inverse the bits and use & operator to get the
         * specific output
         * number - 1 1 0 1 1 1
         * mask - 1 1 1 0 1 1 1
         * & - 1 1 0 0 1 1
         ****/
        int mask = 1 << ith_bit;
        mask = ~mask; // opertor user to inverse all the bits
        System.out.print((mask & num));
        sc.close();
    }
}