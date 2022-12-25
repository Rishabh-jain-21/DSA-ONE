
// find all the permutations of an array using iterative method

public class AllPermutations3 {

    public static void permuteAll(String arr) {
        int f = Factorial(arr.length());

        for (int i = 0; i < f; i++) {
            int temp = i;
            StringBuilder sb = new StringBuilder(arr);
            for (int j = arr.length(); j >= 1; j--) {
                int q = temp / j;
                int r = temp % j;

                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();
        }
    }

    public static int Factorial(int fact) {
        if (fact == 0) {
            return 1;
        }
        return fact * Factorial(fact - 1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        permuteAll(str);
    }
}
