package MoreAboutOOps.Super;

public class Student extends Person{
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
