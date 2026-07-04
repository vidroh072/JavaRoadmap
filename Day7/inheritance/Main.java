package Day7.inheritance;

        //       Animal (class)
        //          |
        //      ---------       Dog and Cat class inheritance from Animal
        //      |       |
        //     Dog     Cat

public class Main {
    public static void main(String[] args) {
        // Inheritance = One class inherits the attibutes  and methods
        //               from another class
        //               Child <- parent <- Grandparent

        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();      // dog class inheritate eat method from Animal class
        System.out.println(cat.isAllive);

    }
}
