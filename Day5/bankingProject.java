package Day5;
import java.util.Scanner;
public class bankingProject {
    static double balance = 1000;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       // variable declaration

       boolean isTrue  = true;
       // main menu
       while (isTrue){
        System.out.println("\n=====  AKB Banking  =====");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit Balance");
        System.out.println("3. Withdraw Balance");
        System.out.println("0. Exit");
        System.out.print(" ----> ");
        int userChoice;
        userChoice = sc.nextInt();

        switch (userChoice) {
            case 1 -> showBalance();
            case 2 -> depositBalance();
            case 3 -> withdrawBalance();
            case 0 -> isTrue = false;
            default -> System.out.println("Wrong Input");
        }
       }
    }
    // show balance
    static void showBalance(){
        System.out.printf("Your Balance Is %.2fRs\n",balance);
    }
    // depost balance
    static void depositBalance(){
        double depositAmt;
        System.out.println("Enter Amt You want to Deposit!");
        System.out.print(" ----> ");
        depositAmt = sc.nextDouble();
        if (depositAmt>0){
            System.out.println("Your Amt is Successfully Deposited!");
            balance+=depositAmt;
        }
        else System.out.println("Please Enter valid Amt!");
    }
    // withdraw balance
    static void withdrawBalance(){
        double withdrawAmt;
        System.out.println("Enter Amt You want to Deposit!");
        System.out.print(" ----> ");
        withdrawAmt = sc.nextDouble();
        if(withdrawAmt>0 && withdrawAmt<balance){
            balance-=withdrawAmt;
            System.out.printf("Your Amt of %.2f Successfully withdrawed!",withdrawAmt);
        }
        else System.out.println("Please Enter valid Amt!");

    }
}
