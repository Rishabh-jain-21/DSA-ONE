import java.util.ArrayList;
/*
1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
Use sample input and output to take idea about output.
*/

public class GetMazePath {
    public static void main(String[] args) {
        ArrayList<String> al = getMazePaths(0, 0, 2, 2);
        System.out.print(al);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        // base case
        if (sr == dr && sc == dc) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        ArrayList<String> path1 = new ArrayList<>();
        ArrayList<String> path2 = new ArrayList<>();
        // move horizontal
        if (sr < dr) {
            path1 = getMazePaths(sr + 1, sc, dr, dc);
        }

        // move vertical
        if (sc < dc) {
            path2 = getMazePaths(sr, sc + 1, dr, dc);
        }

        ArrayList<String> paths = new ArrayList<>();
        for (String hpath : path1) {
            paths.add("H" + hpath);
        }

        for (String vpath : path2) {
            paths.add("V" + vpath);
        }

        return paths;
    }
}