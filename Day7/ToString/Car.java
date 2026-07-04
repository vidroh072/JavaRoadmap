package Day7.ToString;

public class Car {
    String name;
    int year;
    double price;

    Car(String name,int year,double price){
        this.name = name;
        this.year = year;
        this.price = price;
    }
    @Override   // toString to return default value if object called
    public String toString(){
        return this.name + " "+this.year+" "+this.price;
    }
}
