package Exception;

// custom exception creating from exception class
class AgeException extends Exception{
    AgeException(String message){       
        super(message);
    }
}
public class CustomException {
    // throws AgeException - may exception occur
    static void vote(int age) throws AgeException{
        if(age<18){
            // throw exception 
            throw new AgeException("Not Eligible");
        }
        System.out.println("Eligible");
    }
    public static void main(String[] args) {
        // handling exception
        try{
            vote(19);
            vote(10);
        }
        catch(AgeException e){
            System.out.println(e.getMessage());
        }
    }
    
}