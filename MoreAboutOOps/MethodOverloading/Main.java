package MoreAboutOOps.MethodOverloading;
class Animal {

    void move(){        // move method
        System.out.println("The Animal is Running");
    }

}
class Dog extends Animal{

}
class Fish extends Animal{

    @Override
    void move(){
        System.out.println("The animal is Swimming!");
    }
}

public class Main {
    public static void main(String[] args) {
        
        // Method Overloading = 
        //          When a subclass provides its own 
        //          implementation of a method that is already define
        //          Allows for code reusablity and give specific implementation

        Dog dog = new Dog();
        Fish fish = new Fish();

        dog.move();     // dog is running   both class have same method
        fish.move();    // fish is swimming     but fish override method
    }
}
