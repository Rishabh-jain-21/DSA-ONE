// https://youtu.be/A2stw5daCyA
public class TowerOfHanoi {
    public static void main(String[] args) {

        int n = 3;
        int t1 = 10;
        int t2 = 11;
        int t3 = 12;
        toh(n, t1, t2, t3);
    }

    public static void toh(int n1, int td1, int td2, int td3) {
        // base case
        if (n1 == 0)
            return;
        toh(n1 - 1, td1, td3, td2);
        System.out.println(n1 + "[" + td1 + " -> " + td2 + "]");
        toh(n1 - 1, td3, td2, td1);
    }

}
