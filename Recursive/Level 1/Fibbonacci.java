public class Fibbonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a + "\n" + b);
        fibb(a, b, 5 - 2);
    }

    private static void fibb(int a, int b, int n) {

        if (n == 0) {
            return;
        }

        int c = a + b;
        System.out.println(c);
        fibb(b, c, n - 1);
    }
}
