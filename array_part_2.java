import java.util.Arrays;
import java.util.Scanner;

public class array_part_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arr size");
        int value = sc.nextInt();
        int[] arr1 = new int[value];
        int[] b = arr1; // reference was copied
        int[] c = arr1;

        System.out.println("enter " + value + " element for arr");
        for (int i = 0; i < value; i++) {
            arr1[i] = sc.nextInt();
        }

        b[3] = 90;
        // System.out.println(arr1);
        // System.out.println(b);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));

        System.out.println("reverse arr:");
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        System.out.println("your arr while:");
        int j = 0;
        while (j < arr1.length) {
            System.out.print(arr1[j] + " ");
            j++;
        }
        System.out.println();

    }
}
