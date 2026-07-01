public class operators {
    public static void main(String[] args) {
        
        int x = 5;
        int y = 4;
        float result;
        // operators
        // x + y
        // x - y
        // x / y
        // x * y
        // x % y
        result =x%y;
        System.out.println(result);

        // Augmented assignment operators
        x += y;    // x = x + y

        // Increment and Decrement operators
        int p = 1;
        int q = 1;
        p++;  // p=p+1
        q--;  // q = q-1


        // order of operations  [P-E-M-D-A-S]

        double value = 3 + 4 *(7-5)/2;
        // System.out.println(value);
    }
    
}