package Day7.Abstract;

public class Rectangle extends Shape{
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
