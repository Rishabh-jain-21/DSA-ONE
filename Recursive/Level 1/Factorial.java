class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(1));
    }

    private static int factorial(int f) {
        // base case
        if (f == 0) {
            return 1;
        }

        return f * factorial(f - 1);
    }
}