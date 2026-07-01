package Day3;
public class ternaryOperator {
    public static void main(String[] args) {
        
        // ternary operator ? = Return 1 of 2 values if condition true
        // variable = (conditon) ? ifTrue : ifFalse;

        int studentClass = 9;

    /*  if (studentClass>=9){
            System.out.println("Senior");
        }
        else{
            System.out.println("Junior");
        }
    */
        // with using ternary operator --> only for small if else not complex
        String StudentCat = studentClass>=9 ? "Senior" : "Junior";
        System.out.println(StudentCat);
   }    
}