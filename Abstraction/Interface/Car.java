package Abstraction.Interface;

public class Car implements Vehicle {
    public void start(){
        System.out.println("Car Starting.....");
    }
    public void stop(){
        System.out.println("Car Stopping.....");
    }

    // @Override
    // public void displayInfo(){
    //     System.out.println("This is a car.");
    // }
}
