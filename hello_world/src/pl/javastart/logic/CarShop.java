package pl.javastart.logic;

import pl.javastart.data.Car;

public class CarShop {
    public static void main(String[] args) {
        Car car1 = new Car(2017,"AUDI","A4");
        Car car2 = new Car(2017,"BMW","320D","red");

        car1.setColor("PURPLE");
        car1.setYear(2015);
        System.out.println("car1: change color and year to: " + car1.getColor() + " " + car1.getYear());

        car2.setColor("ORANGE");
        car2.setYear(-1992);
        System.out.println("car2: change color and year to: " + car2.getColor() + " " + car2.getYear());

        car1.printInfo();
        car2.printInfo();
    }
}

