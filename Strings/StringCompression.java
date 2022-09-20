import java.util.Scanner;

public class StringCompression {

    /**
     * @param str
     * @return
     */
    public static String compression1(String str) {
        // write your code here
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder(str);
        while (j < sb.length()) {
            if (sb.charAt(i) != sb.charAt(j)) {
                i++;
                sb.setCharAt(i, sb.charAt(j));
                j++;
            }
            j++;
        }

        return sb.toString().substring(0, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print(compression1(str));
    }
}
