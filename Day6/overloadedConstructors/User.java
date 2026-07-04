package Day6.overloadedConstructors;

public class User {
    
    String name;
    String email;
    int age;

    // varrying no of constructors
    User(){
        this.name = "temp";
        this.email = "temp@gmail.com";
        this.age = 0;
    }
    User(String name){
        this.name = name;
        this.email = "temp@gmail.com";
        this.age = 0;
    }
    User(String name, String email){
        this.name = name;
        this.email = email;
        this.age = 0;
    }
    User(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;

    }
}
