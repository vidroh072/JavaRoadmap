package Day6.Static;

public class Friend {
    // int numOfFreinds;        // numOfFreinds is now object specific
    static int numOfFreinds;    // now it is not object specified 
    String name;
    
    Friend(String name){
        numOfFreinds++;
    }
    
}