package Exception;

public class ExceptionHandling {
    public static void main(String[] args) {
        // Exception is event that interrupts the normal flow of program excecution;

        try{
        System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("it Always run");
        }
    }
}
