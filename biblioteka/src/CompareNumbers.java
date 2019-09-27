import java.util.Random;

public class CompareNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(100),y = rand.nextInt(100);

        System.out.println("x = " + x + " y = " + y);

        //czy x jest większe o y
        boolean result = (x > y);
        System.out.println("x > y:" + result);
        //czy x*2 > y
        result = ((x*2) > y);
        System.out.println("x*2 > y? :" + result);

        //czy y < x+3 i jednoczesnie y > x-2
        result = (y < (x+3)) && (y > (x-2));
        System.out.println("y < x+3 and y > x-2:" + result);

        //czy iloczyn x i y jest parzysty
        result = ((x * y) % 2 == 0);
        System.out.println("x*y jest parzyste?:" + result);


    }
}

