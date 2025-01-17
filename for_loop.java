public class for_loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("\n \n");
        for (int i = 10; i > 0; i--) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}