public class reverse_int {

    public static void reverseNum(int num) {
        if (num == 0) {
            // base case
            return;
        }
        System.out.println(num);
        // recursive case
        reverseNum(num - 1);
    }

    public static void main(String[] args) {
        reverseNum(7);
    }
}
