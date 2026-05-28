package Encapsulation;

public class MainClass {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2020);

        // Accessing car details using getter methods
        System.out.println(myCar.getCarDetails());

        // Modifying car details using setter methods
        myCar.setYear(2021);
        System.out.println(myCar.getCarDetails());
    }
}
