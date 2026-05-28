package Abstraction.Abstract;

public class MainClass {
    public static void main(String[] args) {
        Car myCar = new Car();
        Bike myBike = new Bike();

        myCar.start();
        myCar.displayInfo();
        myCar.stop();
        System.out.println(myCar.getCarDetails());

        myBike.start();
        myBike.displayInfo();
        myBike.stop();
    }
}
