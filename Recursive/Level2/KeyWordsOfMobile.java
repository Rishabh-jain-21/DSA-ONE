import java.util.ArrayList;

public class KeyWordsOfMobile {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String num = sc.next();
        // sc.close();
        System.out.println(getKPC("783"));
    }

    static ArrayList<String> getKPC(String num) {

        // base case

        if (num.length() == 0) {
            // return null;
            ArrayList<String> s = new ArrayList<>();
            s.add("");
            return s;
        }

        char ch = num.charAt(0);
        String code = getKeyCode(ch);
        // System.out.println(code);
        ArrayList<String> ans = getKPC(num.substring(1));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < code.length(); i++) {
            char newCh = code.charAt(i);
            for (int j = 0; j < ans.size(); j++) {
                list.add(newCh + ans.get(j));
            }
        }
        return list;
    }

    static String getKeyCode(char k) {
        int key = k - '0';
        String code = "";
        switch (key) {
            case 0:
                code = ".;";
                break;
            case 1:
                code = "abc";
                break;
            case 2:
                code = "def";
                break;
            case 3:
                code = "ghi";
                break;
            case 4:
                code = "jkl";
                break;
            case 5:
                code = "mno";
                break;
            case 6:
                code = "pqrs";
                break;
            case 7:
                code = "tu";
                break;
            case 8:
                code = "vwx";
                break;
            case 9:
                code = "yz";
                break;
        }
        return code;
    }

}
