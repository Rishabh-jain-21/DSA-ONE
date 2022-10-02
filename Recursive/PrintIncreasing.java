public class PrintIncreasing {
    public static void main(String[] args) {
        int num = 5;
        PrintIncreasing pd = new PrintIncreasing();
        pd.increasing(num);
    }

    void increasing(int num) {
        if (num == 1) {
            System.out.println(num);
            return;
        }
        increasing(num - 1);
        System.out.println(num);
    }
}