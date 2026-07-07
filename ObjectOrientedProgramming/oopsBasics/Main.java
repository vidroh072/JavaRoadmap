package ObjectOrientedProgramming.oopsBasics;

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
