package Exception;

import java.io.IOException;

public class Throw {
    //Throw is used to manually create and throw an exception
    //  Actualy thow an exception
    public static void main(String[] args) {
        bookSeat(-10);
        
        System.out.println("Code is running");
    }
    static void bookSeat(int seats){
        if(seats<0){
            throw new 
            IllegalArgumentException("Seats Cannot be Negative");
            // by doing this you are saying - this is invalid situtaion
            //            Stop and throw an exception;
        }
    }
    
    // throws declares that a method may throw an exception and passes the
    // responsiblity to the caller
    // only declare exception may occur
    
    // void readFile() throws IOException
}

