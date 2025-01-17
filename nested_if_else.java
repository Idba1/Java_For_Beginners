import java.util.Scanner;

public class nested_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        // System.out.println(n1);
        if (n1 > 0) {
            System.out.println(n1 + " number is positive");
            if (n1 % 2 == 0) {
                System.out.println(n1 + " is a even number");
            } else {
                System.out.println(n1 + " is a odd number");
            }
        } else {
            System.out.println(n1 + " number is negative");
        }
        if (n1 > 0 && n1 % 2 == 0) {
            System.out.println("positive & even");
        } else if (n1 > 0 && n1 % 2 != 0) {
            System.out.println("positive & oss");
        } else {
            System.out.println("negative");
        }
    }
}
