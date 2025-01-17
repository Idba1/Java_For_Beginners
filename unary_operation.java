public class unary_operation {
    public static void main(String[] args) {
        // preincrement
        int a = 9;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        // predecrement
        a = 9;
        b = --a;
        System.out.println(a);
        System.out.println(b);

        System.out.println("\n \n");

        // postincrement
        int c = 9;
        int d = c++;
        System.out.println(c);
        System.out.println(d);
        // postdecrement
        c = 9;
        d = c--;
        System.out.println(c);
        System.out.println(d);
    }
}
