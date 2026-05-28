package Abstraction.Abstract;

//define abstract class named Vehicle
public abstract class Vehicle {
    private String Name;
    private String Brand;
    private String color;
    private int year;

    public abstract void start();
    public abstract void stop();

    public void displayInfo(){
        System.out.println("This is a vehicle.");
    }

    protected String getName(){ return Name;}
    protected String getBrand(){ return Brand;}
    protected String getColor(){ return color;}
    protected int getYear(){ return year;}

    protected void setName(String name){ this.Name = name;}
    protected void setBrand(String brand){ this.Brand = brand;}
    protected void setColor(String color){ this.color = color;}
    protected void setYear(int year){ this.year = year;}
}
