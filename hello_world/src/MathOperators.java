public class MathOperators {
    public static void main(String[] args) {
        double x = 6.0, y = 6.0;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

        boolean isXGreaterThanY = x>y;
        System.out.println("isXGreaterThanY:" + isXGreaterThanY);

        boolean xEqualsY = (x == y);
        System.out.println("Czy x jest równy y:" + xEqualsY);
    }
}
