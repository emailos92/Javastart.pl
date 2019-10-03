public class CarShop {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.brand = "AUDI";
        car1.model = "A4";
        car1.color = "Czarny";
        car1.wheelColor = "Srebrny";
        car1.tiresColor = "Czarny";
        car1.doors = 5;

        car2.brand = "BMW";
        car2.model = "320D";
        car2.color = "Czerwony";
        car2.wheelColor = "Czarny";
        car2.tiresColor = "Białe";
        car2.doors = 3;

        System.out.println(car1.brand + car1.doors);

        System.out.println(car1.brand + ", " + car1.model + ", " + car1.color + ", " +
                "kolor felgi: " + car1.wheelColor + ", kolor opon: " + car1.tiresColor + ", liczba drzwi: " + car1.doors);
        System.out.println(car2.brand + ", " + car2.model + ", " + car2.color + ", " +
                "kolor felgi: " + car2.wheelColor + ", kolor opon: " + car2.tiresColor + ", liczba drzwi: " + car2.doors);
    }
}
