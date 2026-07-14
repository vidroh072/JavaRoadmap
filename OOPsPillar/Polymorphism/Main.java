package OOPsPillar.Polymorphism;

abstract class Animal{
    abstract void eat();
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating!");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("Cat is eating!");
    }

}
public class Main {
    // polymorphism = one refrence type refer to diffrent object type allowing
    //                diffrent behaviour at runtime;
    public static void main(String[] args) {
        String type = "ct";
        Animal animal;  // one refrence type Animal two object type Cat & Dog;
        if (type.equals("cat")) animal = new Cat();
        else animal = new Dog();

        animal.eat();   // same animal vairable use
        
    }
}
