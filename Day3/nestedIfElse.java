package Day3;

public class nestedIfElse{
    public static void main(String[] args) {
        
    //     if(){
    //         if(){

    //         }
    //     }
    //     else{

    //     }
    // }

    boolean isStudent = true;
    boolean isSenior = false;
    double price = 10000.0;
    System.out.printf("Orignal Price %,.1f\n",price);
    if(isStudent){
        if(isSenior){
            System.out.println("Discount of 30% Applied");
            price*=0.7;
            System.out.printf("Price %,.1f",price);
        }
        else{
            price*=0.9;
            System.out.println("Discount of 10% Applied");
            System.out.printf("Price %,.1f",price);
        }
    }
    else{
        System.out.println("You are not Student No Discount!");
        System.out.printf("Price %,.1f",price);
        }
   }
}