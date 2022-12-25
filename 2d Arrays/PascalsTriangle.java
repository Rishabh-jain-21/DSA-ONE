import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {
        int ans = 5;
        List<List<Integer>> list = generate(ans);
        System.out.println(list);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> blist = new ArrayList<>();
        int size = 1;

        // doing manual work
        if (numRows == 1) {
            list1.add(1);
            blist.add(list1);
            return blist;
        }
        list1.add(1);
        blist.add(list1);
        list2.add(1);
        list2.add(1);
        blist.add(list2);

        // try automating the rest
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i < numRows; i++) {
            list.add(1);
            for (int j = 0; j < size; j++) {
                list.add(list2.get(j) + list2.get(j + 1));
            }
            list.add(1);
            size++;
            blist.add(list);
            list2 = list;
            list = new ArrayList<>();
        }

        return blist;
    }

}
