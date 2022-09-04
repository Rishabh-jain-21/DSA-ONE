import java.util.Scanner;

// find all the trailing zeros for the given factorial;
public class TrailingZeroFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        /*
         * in this question we will find the trailing zeroe's
         * 20 - 1*2*3*4*5 ___ *20
         * we know that trailing zero'es can be made by using the (5 * 2) pair, so in
         * this case
         * we can find the trailing zeroes by using multiple of 5
         * 
         * // side case
         * 30 - 1*2*3*4*5*___*20*21*__*25*26*__*30
         * in this case we can'nt rely only on the 5 we have to see for 25 (5*5) so here
         * should be
         * 7 trailing zeroes
         */

        int result = 0;
        for (int i = 5; i <= num; i *= 5) {
            result = result + (num / i);
        }
        System.out.println(result);
    }
}
