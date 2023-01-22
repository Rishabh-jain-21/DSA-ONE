
// 1. You are given a string that contains only lowercase and uppercase alphabets. 
// 2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
//    For "abecd", the answer should be "a1b3e-2c1d", as 
//    'b'-'a' = 1
//    'e'-'b' = 3
//    'c'-'e' = -2
//    'd'-'c' = 1
import java.util.Scanner;

public class ConsecutiveCharacterInString {
    public static String solution(String str) {
        // write your code here
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < length; i++) {
            int ans = str.charAt(i) - str.charAt(i - 1);
            sb.append(str.charAt(i - 1));
            sb.append(ans);
            // sb.append(str.charAt(i));
        }
        sb.append(str.charAt(length - 1));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
    }
}
