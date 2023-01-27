import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 2, 2, 1, 2 };
        int ans = bfs(arr);
        int ans2 = opt(arr);
        System.out.print(ans + " " + ans2);
    }

    private static int bfs(int[] a) {
        int n = a.length / 2;
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
                if (count > n) {
                    return a[i];
                }
            }
        }
        return -1;
    }

    private static int opt(int[] a) {
        int mid = a.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int k : a) {
            if (map.containsKey(k)) {
                map.put(k, map.get(k) + 1);
            } else {
                map.put(k, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > mid) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
