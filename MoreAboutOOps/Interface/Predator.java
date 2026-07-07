package MoreAboutOOps.Interface;

public interface Predator {
    void hunt();

    default void more(){    // create method without implemeting in other class
        System.out.println("ther is more info about predator");
    }
    static void info(){
        System.out.println("ther is predator");
    }
}
