import java.io.*;
import java.util.*;

public class ToggleString {

    public static String toggleCase(String str) {
        String hmm = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97) {
                hmm += (char) (str.charAt(i) - 32);
            } else {
                hmm += (char) (str.charAt(i) + 32);
            }
        }
        return hmm;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

}
