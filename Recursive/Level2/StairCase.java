import java.util.*;

public class StairCase {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ans = getStairPaths(n);
        System.out.print(ans);
        sc.close();
    }

    public static ArrayList<String> getStairPaths(int n) {
        // base case
        // there are two base case positive base case which we are going to consider and
        // negative base case which we are going to leave

        if (n == 0) {
            ArrayList<String> right = new ArrayList<>();
            right.add("");
            return right;
        } else if (n < 0) {
            ArrayList<String> wrong = new ArrayList<>();
            return wrong;
        }

        // basically we have 3 ways to climb a stair

        ArrayList<String> path1 = getStairPaths(n - 1);
        ArrayList<String> path2 = getStairPaths(n - 2);
        ArrayList<String> path3 = getStairPaths(n - 3);

        ArrayList<String> path = new ArrayList<>();

        // here we are getting path returned by a particular array.

        for (String k : path1) {
            path.add(1 + k);
        }
        for (String k : path2) {
            path.add(2 + k);
        }
        for (String k : path3) {
            path.add(3 + k);
        }

        return path;
    }

}