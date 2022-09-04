
// Set the ith bit as one if it is zero else do nothing
import java.util.Scanner;

public class SetBit {
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
         * use |(or) operator on the number and mask and will return the new number.
         * number -> 1 1 0 1 1 1
         * mask -> 0 0 1 0 0 0
         * | -> 0 0 0 0 0 0
         ****/
        int mask = 1 << ith_bit;
        System.out.print("After setting the bit new Number will be" + (num | mask));
        sc.close();
    }
}