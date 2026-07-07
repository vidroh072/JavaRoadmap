package MoreAboutOOps.Super;

public class Main {
    public static void main(String[] args) {
        // here parent classs is superclass

        // super = Refers to the parent class (subclass <- superclass)
        //         used in constructors and method overriding
        //         calls the parent constructors to initialize attributes

        Student student = new Student("mukesh", "kumar", 18);
        student.showName();     // Person class method
        student.showAge();      // Student class method
    }
}
