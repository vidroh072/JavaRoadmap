package Day2;

import java.util.Scanner;

public class ifStatement {
    // if statement = perform a block of code if its condition is true

    public static void main(String[] args) {
        
        /*  if(condition){
            }
            else if(condition){
            }
            else{
            }
        */
       String name;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        name = sc.nextLine();

        // simple if statement 
        if(name.isEmpty()){
            System.out.println("You Dont Enter Your Name!!");
        }

        System.out.print("Hy "+name+ " Enter Your Age: ");
        age = sc.nextInt();
        sc.nextLine();      // we use this bcz nextline is skipped
        
        // if else ladder
        if (age>18){
            System.out.println("Your are ELigible for Vote ");
        }
        else if(age<18){
            System.out.println("You are not Eligible for vote");
        }
        else System.out.println("wrong Input");

        sc.close();
    }
}
