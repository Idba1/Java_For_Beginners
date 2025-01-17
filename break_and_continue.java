import java.util.Scanner;

public class break_and_continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            // if (id == i) {
            // continue;
            // }
            // System.out.println(i);

            if (i == id) {
                System.out.println("found");
                break;
            } else {
                System.out.println("not found");
            }
        }
    }
}