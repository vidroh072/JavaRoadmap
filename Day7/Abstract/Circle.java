package Day7.Abstract;

public class Circle extends Shape{
    double rad;
    Circle(double rad){
        this.rad = rad;
    }
    void area() {
        System.out.println("Area of Circle"+3.14*rad*rad);
    }
    
}
