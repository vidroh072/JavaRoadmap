package ObjectOrientedProgramming.Static;

public class Main {
    public static void main(String[] args) {
        
        // static = Makes a variable or method belong to the class
        //          rather than to any specific Object.
        //          Commonly used for utility methods or shared resources

        Friend freind1 = new Friend("Mukesh");
        Friend freind2 = new Friend("Naresh");
        Friend freind3 = new Friend("Naresh");

        // numOfFreinds not increasing
        // bcz numOfFreinds is not static -- object specific
        System.out.println(Friend.numOfFreinds);    // now it is accesing as class

    }

}
