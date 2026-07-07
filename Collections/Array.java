package Collections;

import java.util.Arrays;

public class Array {
    // Collection of element of the same data type stored in contiguous
    // memory locations.
    // problem ->  wasted of memory
    //         ->  Fixed size
    public static void main(String[] args) {
        
        String[] fruits = {"apple","orange","banana","coconut"};
        //                    0        1        2        3
        String[] foods = new String[5]; // declaring empty array  of 5 lenght

        // String name = fruits[0];
        // int num = fruits.length;     // lenght is fx not method
        // Arrays.sort(fruits);     --> sorting
        // Arrays.fill(fruits, "choclate");

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        Arrays.fill(foods, "Abc");

        // advanced loop for iteration of array

        for (String food : foods) {
            System.out.println(food);
            
        }

        // Searching in array
        String target = "aple";
        boolean notFound = true;
        for (String fruit : fruits) {
            if(fruit.equalsIgnoreCase(target)){
                System.out.println("the Apple Found");
                notFound = false;
            }
        }
        if (notFound) System.out.println("not found");

    }
}
