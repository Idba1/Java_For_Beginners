public class recursion {

    public static int sumNumber(int num) {
        int total = 0;
        // base case
        if (num == 1) {
            return 1;
        }

        total = num + sumNumber(num - 1);

        return total;
    }

    public static void main(String[] args) {
        int result = sumNumber(4);
        int result2 = sumNumber(5);
        System.out.println(result);
        System.out.println(result2);
    }
}
