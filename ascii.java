import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str3 = "Hey! This is Idba. How Are YOU?!";
        for (int i = 0; i < str3.length(); i++) {
            if (str3.codePointAt(i) > 65 && str3.codePointAt(i) < 90) {
                System.out.println(str3.charAt(i));
            }
        }
        int num1 = 65;
        System.out.println((char) num1);
        char chr = 'A';
        System.out.println((int) chr);
        String str1 = "hello";
        System.out.println(str1.codePointAt(1));
        String str2 = sc.nextLine();
        System.out.println(str2.length());
        for (int i = 0; i < str2.length(); i++) {
            System.out.println(str2.charAt(i) + " " + str2.codePointAt(i));
        }
    }
}
