import java.util.Stack;

public class MergeIntervals {

    public static void print(Stack<int[]> arr) {
        Stack<int[]> st1 = new Stack<>();
        for (int i = 0; i < arr.size(); i++) {
            st1.push(arr.pop());
        }

        for (int i = 0; i < st1.size(); i++) {
            int temp[] = st1.pop();
            System.out.println(temp[0] + " " + temp[1]);
        }
    }

    public static void merge(int[][] arr) {
        Stack<int[]> st = new Stack<>();
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int temp[] = st.pop();
            if (temp[1] > arr[i][0]) {
                int temp1 = temp[0];
                int temp2 = arr[i][1];
                if (arr[i][1] < temp[1]) {
                    temp2 = temp[1];
                }
                st.push(new int[] { temp1, temp2 });
            } else {
                st.push(temp);
                st.push(new int[] { arr[i][0], arr[i][1] });
            }
        }
        print(st);
    }

    public static void main(String[] args) {
        int arr[][] = new int[][] { { 1, 6 }, { 3, 5 }, { 5, 8 }, { 8, 9 }, { 10, 12 } };
        merge(arr);
    }

}