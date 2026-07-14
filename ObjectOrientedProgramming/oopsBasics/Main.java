package ObjectOrientedProgramming.oopsBasics;
class Car {      // car is blueprint class

    String name = "ford";           // Attributes of car
    String model = "mustang";
    int year = 2026;
    double price = 1225000;
    boolean isRunning = false;

    void start(){
        System.out.println("Car is Running!! ");    // methods (to perform action)
        isRunning = true;
    }
    void stop(){
        System.out.println("Car is Stopped!! ");    // methods
        isRunning = false;
    }
}

public class Main {
    public static void main(String[] args) {

        // class is an blueprint of object
        // object = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type

        Car car = new Car();        // create Car object
        System.out.println(car);    // its refrence data type print refrence location
        System.out.printf("%,.2f\n",car.price);   // accessing car attributes 
        System.out.println(car.isRunning);   // accessing isRunning attributes 
        car.start();        // accessing methods
    }
}
