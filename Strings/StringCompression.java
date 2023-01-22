import java.util.Scanner;

public class StringCompression {

    private static void compression1(String str) {
        int i = 0, length = str.length();
        String compresssedString1 = "";
        while (i < length - 1) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                compresssedString1 += str.charAt(i);
            }
            i++;
        }
        compresssedString1 += str.charAt(length - 1);
        System.out.println(compresssedString1);
    }

    private static void compression2(String str) {
        // wwwwaaadexxxxxx
        int i = 0, length = str.length(), count = 1;
        String CompressedString = "";
        while (i < length) {
            if (i == (length - 1) || str.charAt(i) != str.charAt(i + 1)) {
                CompressedString += str.charAt(i);
                // count++;
                if (count > 1) {
                    CompressedString += count;
                }
                count = 0;
            }
            count++;
            i++;
        }
        System.out.println(CompressedString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        compression1(str);
        compression2(str);
    }
}