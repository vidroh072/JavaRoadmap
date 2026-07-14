package MoreAboutOOps.Super;
class Person {
    String first;
    String last;

    Person(String first,String last){
        this.first = first;
        this.last = last;
    }
    void showName(){
        System.out.printf("Your Name is %s %s\n",this.first,this.last);
    }
}

class Student extends Person{
    int age;

    Student(String first, String last, int age) {
        super(first, last);
        // we use it to fix error bcz Person class req two arguments;
        this.age = age;
    }
    void showAge(){
        System.out.println("your age is : "+this.age);
    }

}
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
