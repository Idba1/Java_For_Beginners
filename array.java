import java.util.Arrays;
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
        System.out.println();

        int[] arr2 = new int[] { 1, 43, 44, 23 };
        int[] arr3 = { 34, 234, 45, 34 };
        String[] name = new String[] { "Idba", "Islam", "Rifa", "Anisha" };
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(name));

        for (int i = 0; i < name.length; i++) {
            // System.out.println("Happy Birth Day!" + " " + name[3] + " ");
            System.out.println(name[i]);
        }
        System.out.println(name[2]);
        name[1] = "Adnan";
        System.out.println(name[1]);
    }
}