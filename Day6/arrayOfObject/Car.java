package Day6.arrayOfObject;

public class Car {
    String name;
    String color;

    Car(String name,String color){
        this.name = name;
        this.color = color;
    }
    void drive(){
        System.out.printf("You are driving car %s color %s\n",name,color);
    }
}
