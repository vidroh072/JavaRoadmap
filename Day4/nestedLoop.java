package Day4;

public class nestedLoop {
    public static void main(String[] args) {
        // nested loop = a loop inside another loop used 
        //               often with matrices or DSA

        for(int i = 0; i<4;i++){
            for (int j = 0; j <4; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
