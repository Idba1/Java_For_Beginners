import java.util.Scanner;

public class max_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxValue = 0;

        for (int i = 1; i <= 5; i++) {
            int num = sc.nextInt();
            if (i == 1) {
                maxValue = num;
            } else {
                if (num > maxValue) {
                    maxValue = num;
                }
            }
        }
        System.out.println("max number is " + maxValue);
    }
}
