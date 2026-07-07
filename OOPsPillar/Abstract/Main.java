package OOPsPillar.Abstract;

abstract class Shape {   // made it abstract mean compulsory
    abstract void area();     // if the class is inherit this fx is compulsory

    void display(){
        System.out.println("this is shape");
    }
}

class Circle extends Shape{
    double rad;
    Circle(double rad){
        this.rad = rad;
    }
    void area() {
        System.out.println("Area of Circle"+3.14*rad*rad);
    }
    
}
class Rectangle extends Shape{
    double lenght;
    double breadth;

    Rectangle(double lenght,double breadth){
        this.lenght = lenght;
        this.breadth = breadth;
    }
    void area(){
        System.out.println("Area of Rect"+lenght*breadth);
    }
    
}

public class Main {
    public static void main(String[] args) {
        
        // abstract = Used to define abstract classes and methods
        //            Abstraction is the process of hiding implementation details 
        //            and showing only the essential features;
        //            Abstract classes CANT instatiated directly -- can create
        //            Can contain "Abstract" methods (Which must be implemented)
        //            Can contain "concrete" method (Which are inherited)

        // Shape shape = new Shape();  // we can create directly
        Circle circle = new Circle(1);
        Rectangle rectangle = new Rectangle(5, 10);

        circle.display();       // concrete method
        circle.area();          // Abstract method

    }
    
}
