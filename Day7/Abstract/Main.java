package Day7.Abstract;

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
