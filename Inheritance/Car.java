package Inheritance;

public class Car extends Vehicle {
    public Car(){
        super.Brand = "BMW";
        super.Name = "X500";
        super.color = "Red";
    }

    @Override
    public void start(){
        System.out.println("Car is starting");
    }
    
    @Override
    public void stop(){
        System.out.println("Car is stopping");
    }

    public void displayInfo(){
        System.out.println("Brand: "+super.Brand);
        System.out.println("Name: "+super.getName());
        System.out.println("Color: "+super.color);
    }

}
