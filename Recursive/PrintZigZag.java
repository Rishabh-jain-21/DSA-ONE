public class PrintZigZag {
    public static void main(String[] args) {
        int num = 3;
        zigZag(num);
    }

    public static void zigZag(int num) {
        // base case
        if (num == 0) {
            return;
        }
        System.out.println("Pre: " + num); // 1
        zigZag(num - 1);// 2
        System.out.println("In: " + num);// 3
        zigZag(num - 1);// 4
        System.out.println("Post: " + num);// 5
    }
}
