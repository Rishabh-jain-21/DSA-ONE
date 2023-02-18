/* 
 * You are given 2 string find the largest string which will divide both of the strings. 
 * lets assume that string one length is bigger than the 2nd string length.
*/

public class LargetStringDivide {
    public static void main(String[] args) {
        String a = "bcabcbc";
        String b = "ac";
        // creating class object to avoid using static in functions.
        LargetStringDivide classObject = new LargetStringDivide();
        System.out.print(classObject.gcdOfStrings(a, b));
    }

    public String gcdOfStrings(String str1, String str2) {
        String ans = "";
        for (int i = 0; i < str2.length(); i++) {
            ans += str2.charAt(i);
            if ((!str1.contains(ans)))
                return ans.substring(0, ans.length() - 1);
            else if (i == str2.length() - 1)
                return ans;
        }
        return "woww.";
    }
}
