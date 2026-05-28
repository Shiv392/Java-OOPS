package Abstraction.Abstract;

public class Bike extends Vehicle {
    public void start(){
        System.out.println("Bike is starting.");
    }
    public void stop(){
        System.out.println("Bike is stopping.");
    }

    @Override
    public void displayInfo(){
        System.out.println("This is a bike.");
    }
}
