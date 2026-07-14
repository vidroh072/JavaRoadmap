package MoreAboutOOps.ToString;
class Car {
    String name;
    int year;
    double price;

    Car(String name,int year,double price){
        this.name = name;
        this.year = year;
        this.price = price;
    }
    @Override   // toString to return default value if object called
    public String toString(){
        return this.name + " "+this.year+" "+this.price;
    }
}
public class Main {
    public static void main(String[] args) {
        
        // .toString = Method inherited from the object class
        //             used to return a string representation of an object
        //             by default, it returns a hash code as a unique identifier
        //             it can be overridden to provide meaningful details.

        Car car1 = new Car("Bmw", 2024, 1820000);
        Car car2 = new Car("Swift", 2026, 1000000);

        System.out.println(car1.name);      // getting name
        System.out.println(car1);       // trying to print object 
        // now it will print we create by toString
        System.out.println(car2);
    }
}
