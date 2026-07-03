package Day5;

public class arrays2d {
    public static void main(String[] args) {
        
        // 2D array = An array where each element is an array
        //            useful for storing a matrix of data
        
        //                         0        1       2       
        String[][] groceries ={{"apple","orange","banana"},     //  0
                               {"mango","carrot","papaya"},     //  1  
                               {"onion","garlic","potato"}};    //  2
        groceries[1][1] = "watermellon";
        System.out.println(groceries[0][2]);    // banana
        for (int i = 0; i < groceries.length; i++) {
            for (int j = 0; j < groceries.length; j++) {
                System.out.print(groceries[i][j]+" ");
            }
            System.out.println();
        }

    }
}
