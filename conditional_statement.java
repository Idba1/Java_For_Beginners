import java.util.Scanner;

public class conditional_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a number");
        int num1 = sc.nextInt();
        if (num1 > 100) {
            System.out.println(num1);
        } else if (num1 == 100) {
            System.out.println("equal");
        } else {
            System.out.println("invalid");
        }
    }
}
