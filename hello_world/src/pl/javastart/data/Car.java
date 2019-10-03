package pl.javastart.data;

public class Car {

    public int year;
    public String brand;
    public String model;
    public String color;

    public Car(int year, String brand, String model) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.color = "not set yes";
    }

    public Car(int year, String brand, String model, String color) {
        this(year, brand, model);
        this.color = color;
    }

    public int getYear(){
        return this.year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor(){
        return this.color;
    }

    public void printInfo(){
        System.out.println(this.brand + " " + this.model + " " + this.year + " :" + this.color);
    }

    public void setYear(int year){
        if(year >= 0) {
            this.year = year;
        } else {
            System.out.println("Rok nie poprawny:" + year);
        }
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color){
        this.color = color;
    }
}
