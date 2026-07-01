package Day4;
import java.util.Scanner;

import Day2.random;

import java.util.Random;

public class numberGuessingGame {
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        int randomNum = random.nextInt(1, 11);
        int userNum;

        System.out.println("==== Number Guessing Game ====");
        System.out.println("-- X Num is Selected --");
        System.out.println("Enter Your Choice Now");
        do {
            attempts++;
            System.out.print("----> ");
            userNum = sc.nextInt();
            if(userNum<randomNum) System.out.println("Enter Larger Num");
            else if(userNum>randomNum) System.out.println("Enter Smaller Num");
            else{
                System.out.println("You Won! Correct Guess..");
                System.out.printf("No of Attempts %d",attempts);
            }
        } while (randomNum != userNum);
    }
}
