public class method_calling {

    public static int makeSquare(int num) {
        int squareNumber = num * num;
        return squareNumber;
    }

    public static int sumOfSquare(int a, int b) {
        int result = makeSquare(a) + makeSquare(b);
        return result;
    }

    public static void main(String[] args) {
        int answer = sumOfSquare(2, 2);
        System.out.println(answer);
    }
}
