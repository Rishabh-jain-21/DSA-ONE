public class PrintDecreasing {
    public static void main(String[] args) {
        int num = 5;
        PrintDecreasing pd = new PrintDecreasing();
        pd.decrease(num);
    }

    void decrease(int num) {
        if (num == 1) {
            System.out.println(num);
            return;
        }
        System.out.println(num);
        decrease(num - 1);
    }
}