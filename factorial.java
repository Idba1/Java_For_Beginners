public class factorial {

    public static int factorial(int n) {
        int fac = 1;
        if (n == 0) {
            // base case
            return 1;
        }
        // recursive case
        fac = n * factorial(n - 1);
        return fac;
    }

    public static void main(String[] args) {
        int resultForFactorial = factorial(5);
        System.out.println(resultForFactorial);
    }
}
