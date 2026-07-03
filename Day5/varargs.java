package Day5;
public class varargs {
    public static void main(String[] args) {
        
        // vargs = alow a method to accept a varrying # of arguments 
        //         makes methods more flexible, no need for overloaded methods
        //         java will pack the arguments into an array
        //         ... (ellipsis)

        double result = add(1,2,3);   // varrying no of arguments
        System.out.println(result);
        result = add(1,2,3,4,5);
        System.out.println(result);
    }
    static double add(double ...numbers){        // ... make it array
        double result = 0;
        for (double num : numbers) {
            result+=num;
        }
        return result;
    }
}
