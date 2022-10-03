public class PrintIncreasingDecreasing {
    public static void main(String[] args) {
        int num = 4;
        print(num);
    }

    static void print(int num) {
        // base case
        if (num == 1) {
            System.out.println(num);
            System.out.println(num);
            return;
        }
        System.out.println(num);
        print(num - 1);
        System.out.println(num);
    }
}