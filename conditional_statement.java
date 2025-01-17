import java.util.Scanner;

public class conditional_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a number");
        int num1 = sc.nextInt();
        if (num1 > 0) {
            System.out.println(num1 + " is a positive number");
        }
        if (num1 > 100) {
            System.out.println(num1 + ", 100 er boro");
        } else if (num1 > 50 && num1 < 100) {
            System.out.println(num1 + ", 50 er boro & 100 er choto");
        } else if (num1 < 50) {
            System.out.println(num1 + ", 50 er choto");
        } else {
            System.out.println(num1 + ", 100 er soman");
        }
    }
}
