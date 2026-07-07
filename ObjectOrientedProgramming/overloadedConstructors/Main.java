package ObjectOrientedProgramming.overloadedConstructors;

public class Main {
    public static void main(String[] args) {
        
        // overloaded constructors = Allow a class to have multiple constructors
        //                           with different parameter lists.
        //                           Enable objects to be initialized in various ways

        // different parameter lists;
        User user1 = new User();
        User user2 = new User("Rakesh");
        User user3 = new User("Mukesh","mukesh@gmail.com");
        User user4 = new User("Mukesh","mukesh@gmail.com",18);
        System.out.println(user1.name);
        System.out.println(user2.name);
        System.out.println(user3.email);
        System.out.println(user4.age);
    }
    
}