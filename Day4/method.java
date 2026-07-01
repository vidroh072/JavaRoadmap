package Day4;
public class method {
    public static void main(String[] args) {
        // method = A block of reusable code that is executed when called ()
        hello();  // method calling
        System.out.println(add(5,4));
    }
    // simple method with no parameter
    static void hello(){
        System.out.println("Hello World");
    }
    // method with parameter
    static double add(int a,int b){
        return a+b;     // return the value
    }
    
}