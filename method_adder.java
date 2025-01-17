public class method_adder {

    public static void adder1(int a, int b) {
        System.out.println(a + b);
    }

    public static int adder2(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        adder1(9, 8);
        int result = adder2(8, 5);
        System.out.println(result);
    }
}
