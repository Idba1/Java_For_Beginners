import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("num1 is " + num1);

        System.out.println("please enter a double number: ");
        double num2 = sc.nextDouble();
        System.out.println("num2 is " + num2);

        boolean isValid = sc.nextBoolean();
        System.out.println("Valid check " + isValid);

        sc.nextLine(); // buffer clear
        System.out.println("please enter your name: ");
        String name = sc.nextLine();
        System.out.println("your name is " + name);

        System.out.println("please enter your friend name: ");
        String name2 = sc.next(); // spache chole asle ar read korte pare na
        System.out.println("your name2 is " + name2);
    }
}