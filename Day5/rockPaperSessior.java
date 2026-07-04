package Day5;
import java.util.Scanner;
import java.util.Random;

public class rockPaperSessior {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        // variable declaration
        String[] options = {"stone","paper","sessior"};
        String computer = options[random.nextInt(3)];

        //user input
        System.out.println("==== Welcome to Game ====");
        System.out.println("select from # (stone, sessior, paper)");
        System.out.print(" ----> ");
        String player = sc.nextLine().toLowerCase();
        if (!player.equals("paper") && 
            !player.equals("stone") && 
            !player.equals("sessior")){
                System.out.println("invalid Choice!!");
        }
        if(player.equals(computer)){
            System.out.println("Horray You won 😊");
            System.out.printf("You choose %s & computer choose %s",player,computer);
        }else if
        (player.equals("paper") && computer.equals("stone")){
            System.out.println("Horray You won 😊");
            System.out.printf("You choose %s & computer choose %s",player,computer);
        }
        else if
        (player.equals("stone") && computer.equals("sessior")){
            System.out.println("Horray You won 😊");
            System.out.printf("You choose %s & computer choose %s",player,computer);
        }
        else if
        (player.equals("sessior") && computer.equals("paper")){
            System.out.println("Horray You won 😊");
            System.out.printf("You choose %s & computer choose %s",player,computer);
        }
        else if
        (player.equals("sessior") && computer.equals("stone")){
            System.out.println("Oops You Lost!! 😔");
            System.out.printf("You choose %s & computer choose %s",player,computer);
        }
        else if
        (player.equals("stone") && computer.equals("paper")){
            System.out.println("Oops You Lost!! 😔");
            System.out.printf("You choose %s & computer choose %s",player,computer);
        }
        else if
        (player.equals("paper") && computer.equals("sessior")){
            System.out.println("Oops You Lost!! 😔");
            System.out.printf("You choose %s & computer choose %s",player,computer);
        }
        sc.close();
    }
}
