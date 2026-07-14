package MoreAboutOOps.Interface;

interface Prey {
    void flee();
}
interface Predator {
    void hunt(); // class made by it should implement

    default void more(){    // create method without implemeting in other class
        System.out.println("ther is more info about predator");
    }
    static void info(){
        System.out.println("ther is predator");
    }
}
//=================================================
class Rabbit implements Prey{
    @Override
    public void flee() {
        System.out.println("The rabbit is Running");
    }
}

class Tiger implements Predator{
    @Override
    public void hunt() {
        System.out.println("Tiger is Hunting");
    }
}

class Fish implements Prey,Predator{

    @Override
    public void flee(){
        System.out.println("Fish is Fleeing");
    }
    @Override
    public void hunt(){
        System.out.println("fish is hunting");
    }
}
// =======================================
public class Main {
    public static void main(String[] args) {

//        Interface = a blueprint for a class that specifies a set of abstract methods
//                    that implementing classes Must define
//                    Supports multiple inheritance like behavior
    Rabbit rabbit = new Rabbit();
    Fish fish = new Fish();
    rabbit.flee();
    fish.flee();        // Fish class inherit from both Prey & Predator class
    fish.hunt();        // but the Prey and Predator class cannot be created as they are abstract
    }
}
