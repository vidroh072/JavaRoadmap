package ObjectOrientedProgramming.arrayOfObject;
class Car {
    String name;
    String color;

    Car(String name,String color){
        this.name = name;
        this.color = color;
    }
    void drive(){
        System.out.printf("You are driving car %s color %s\n",name,color);
    }
}
public class Main {
    public static void main(String[] args) {
        // array of object = creating object array

        Car car1 = new Car("Mustang","Red");
        Car car2 = new Car("BMW","White");
        Car car3 = new Car("Range Rover","Black");
        Car car4 = new Car("Swift","White");
        car4.color = "Green";                // changing car color 

        // here cars is array of object;
        Car[] cars = {car1,car2,car3,car4};  // here datatype is class name
        cars[0].name = "otherColor";         // changing car color by accesing array
    
        // Car[] cars = {new Car("Mustang","Red"),..};  --> we can also do that

        for(Car car: cars){
            System.out.println(car.name);
            car.drive();
        }

    }
}
