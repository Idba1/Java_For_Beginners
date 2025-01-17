import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arr size");
        int value = sc.nextInt();
        int[] arr1 = new int[value];

        System.out.println("enter " + value + " element for arr");
        for (int i = 0; i < value; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("your arr:");
        for (int i = 0; i < value; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}