public class Calculate {
    public static void main(String[] args) {

        double sum;
        Calculator calc = new Calculator();

        System.out.println(calc.add(10.5,11.7));
        System.out.println(calc.subtract(100,101.89));
        System.out.println(calc.multiply(102,2.76));
        System.out.println(calc.divide(99,1.1));
    }
}
