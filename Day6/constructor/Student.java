package Day6.constructor;

public class Student {
    // String name = "mukesh";    --.  same name for all class object
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name,int age,double gpa){
        this.name = name;       // argument setup at creating obj
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true; // by default argument value 
    }
    // here this is just a keyword;
    void study(){
        System.out.printf("Student is Studying : %s\n",this.name);
    }


    
}