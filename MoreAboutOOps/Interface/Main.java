package MoreAboutOOps.Interface;

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
