package Day6.constructor;

public class Main {
    public static void main(String[] args) {
        // constructor = A special method to initialize objects 
        //               you can pass arguments to a constructor
        //               and set up initial values;

        // we can create object with unique values
       
        // Student student1 = new Student();
        // Student student2 = new Student();
        // System.out.println(student1.name);      // All student have same name 
        // System.out.println(student2.name);      // to fix we use construtor

        // now we create object with passing arguments
        Student student1 = new Student("Ayush", 18, 8.5);
        Student student2 = new Student("Anishk", 19, 8.0);
        // now both student have diffrent names
        System.out.println(student1.name + " "+student2.name);

        student2.study(); // accesing method

    }
}
