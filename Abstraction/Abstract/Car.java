package Abstraction.Abstract;

public class Car extends Vehicle {

    public Car() {
        super.setName("X500");
        super.setBrand("BMW");
        super.setColor("Red");
        super.setYear(2022);
    }

    public void start(){
        System.out.println("Car is starting.");
    }
    public void stop(){
        System.out.println("Car is stopping.");
    }

    @Override
    public void displayInfo(){
        System.out.println("This is a car.");
    }

    public String getCarDetails(){
        return "Name: "+super.getName()+" "+"Brand: "+super.getBrand()+" "+"Color: "+super.getColor()+" "+
        "Year: "+super.getYear();
    }
}
