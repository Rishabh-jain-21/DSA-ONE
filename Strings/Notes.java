// so here we will learn everything about strings and stringBuilder

public class Notes {
    public static void main(String[] args) {
        /*
         * in java we declare strings like any other language.
         * str = "";
         * thats how we declare strings.
         * 1) Strings are immutable in java, means like you can'nt change anything in
         * strings in java.
         * we can'nt update characters in strings in java.
         * Let us understand this by an example.
         * so here i will run a loop and calculate the time taken by the string.
         * here what we can find is it is taking almost 4 seconds which is (4381)
         * millisec to run this piece of
         * code.
         * why ? because as the strings are immutable it always create a new string and
         * append
         * the character to it. which will take longer time than it should take
         */

        // String str = "";
        // long startTime = System.currentTimeMillis();
        // int loop = 100000;
        // for (int i = 0; i < loop; i++) {
        // str = str + i;
        // }
        // long endTime = System.currentTimeMillis();

        /*
         * String Builders are declared as
         * StringBuilder sb = new StringBuilder();
         * StringBuilder is someting which is better than Strings , beacause it does'nt
         * take
         * any extra space it only updates the value at the same position which is not
         * going to
         * take that much time.
         * only takes around 31 ms which is much faster than the string one
         * so it is better to use stringBuilder rather using than strings for the
         * manipulation
         * of data.
         */

        StringBuilder sb = new StringBuilder("");
        long startTime = System.currentTimeMillis();
        int loop = 100000;
        for (int i = 0; i < loop; i++) {
            sb = sb.append(i);
        }
        long endTime = System.currentTimeMillis();

        System.out.print(endTime - startTime);
    }
}
