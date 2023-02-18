import java.util.ArrayList;

public class AllSubSequence {
    public static void main(String[] args) {
        String str = "abc";
        System.out.print(AllSubSequence(str));

    }

    public static ArrayList<String> AllSubSequence(String str) {
        if (str.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        char s = str.charAt(0);
        String res = str.substring(1);
        ArrayList<String> ans = AllSubSequence(res);
        ArrayList<String> newS = new ArrayList<>();

        for (String St : ans) {
            newS.add(s + St);
        }
        for (String St : ans) {
            newS.add("" + St);
        }
        return newS;
    }
}