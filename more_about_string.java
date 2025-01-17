import java.util.Scanner;

public class more_about_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "hello";
        String str2 = "everyone!";
        String str3 = str1 + " " + str2;
        System.out.println(str3);

        String subName = "OOC";
        int code = 221;
        String courseName = subName + code;
        System.out.println(courseName);

        String s1 = "19";
        String s2 = "71";
        // String s3 = s1 + s2;
        // System.out.println(s3);
        // String libaration = "1971";
        // if (s3 == libaration) {
        // System.out.println(true);
        // } else {
        // System.out.println(false);
        // }

        // its check
        String s3 = new String(s1 + s2);
        System.out.println(s3);
        String libaration = new String("1971");
        if (s3.equals(libaration)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        String str = "HELLO";
        if (str.equalsIgnoreCase(str1)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        String s5 = "C";
        String s6 = "c";
        System.out.println(s6.compareTo(s5));
        System.out.println(str1.toUpperCase());
        System.out.println(str.toLowerCase());
    }
}
