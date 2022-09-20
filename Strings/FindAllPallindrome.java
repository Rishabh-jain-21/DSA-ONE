
// package Strings;
import java.util.Scanner;

public class FindAllPallindrome {
    public static void solution(String str) {
        // first lets go for all the substrings.
        // second check for the pallindrome
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String str2 = "";
                int k = i;
                while (k <= j) {
                    str2 += str.charAt(k);
                    k++;
                }
                StringBuilder sb = new StringBuilder(str2);
                sb.reverse();
                if (str2.equals(sb.toString())) {
                    System.out.println(str2);
                }
            }
        }
    }
}