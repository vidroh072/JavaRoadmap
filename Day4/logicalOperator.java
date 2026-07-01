package Day4;

public class logicalOperator {
    public static void main(String[] args) {
        
        //  && = AND
        //  || = OR
        //  !  = NOT

        double temp = 5;
        boolean isSunny = true;

        if(temp<=30 && temp>=4 && isSunny){
            System.out.println("Weather is Good 😊");
            System.out.println("It is Sunny Outside ☀️");
        }
        else if(temp<=30 && temp>=4 && !isSunny){
            System.out.println("Weather is Good 😊");
            System.out.println("It is Cloudy Outside ☁️");

        }

        else if(temp<=4){
            System.out.println("Weather is Cold ❄️");
        }
        else{
            System.out.println("Sorry Weather Error");
        }
    }
}
