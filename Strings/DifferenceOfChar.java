import java.util.Scanner;

public class DifferenceOfChar {
    public static String solution(String str) {
        // write your code here
        String s = "";
        for (int i = 0; i < str.length() - 1; i++) {
            int ans = str.charAt(i + 1) - str.charAt(i);
            s += (char) str.charAt(i);
            s += ans;
        }
        s += str.charAt(str.length() - 1);
        return s;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
    }
}
