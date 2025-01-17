import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "hello";
        String str2 = sc.nextLine();
        System.out.println(str2.length());
        for(int i=0; i<str2.length();i++){
            System.out.println(str2.charAt(i));
        }
    }
}
