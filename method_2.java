public class method_2 {

    public static void greet() {
        System.out.println("Hello from Method World!");
    }

    public static void printEvenNumber(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                System.out.println(arr1[i]);
            }
        }
    }

    public static void main(String[] args) {
        greet();

        int[] arr1 = { 1, 2, 4, 6, 23, 66 };
        printEvenNumber(arr1);
    }
}
