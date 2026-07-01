package Day2;
import java.util.Random;
public class random {
    public static void main(String[] args) {
        
        // creating random object
        Random random = new Random();
        int number1;
        number1 = random.nextInt();      //range btw -2 bliion to +2 billion
        number1 = random.nextInt(1,6);  // 1 to 5

        double number2;
        number2 = random.nextDouble();   // btw 0 and 1
        System.out.println(number2);

        boolean isHead;
        isHead = random.nextBoolean();
        System.out.println(isHead);

        if (isHead) System.out.println("HEADS");
        else System.out.println("TAILS");
    }    
}