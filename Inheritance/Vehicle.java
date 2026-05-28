package Inheritance;

public class Vehicle {
    protected String Name;
    protected String Brand;
    protected String color;

    public void start(){
        System.out.println("Vehicle is starting.");
    }
    public void stop(){
        System.out.println("Vehicle is stopping.");
    }

    public String getName() { return Name; }
}
