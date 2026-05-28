package Abstraction.Interface;

public class MainClass {
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.start();
        myCar.stop();
        myCar.displayInfo();
        System.out.println(myCar.Name);
    }
}
