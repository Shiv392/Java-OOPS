package Abstraction.Interface;

public interface Vehicle {
    public String Name = "Vehicle";
    public String Branch = "Automobile";

    void start();
    void stop();

    //java 8 introducted default method in interface
    //default method lets method with body in interface
    public default void displayInfo(){
        System.out.println("This is vehicle");
    }
}
