package Day6.oopsBasics;

public class Car {      // car is blueprint class
    
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
