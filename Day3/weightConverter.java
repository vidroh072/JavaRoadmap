package Day3;
import java.util.Scanner;

public class weightConverter{
    public static void main(String[] args) {
        System.out.println("====== Weight Converter ======");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Kg to g convert");
        System.out.println("2. g to Kg convert");
        System.out.print("------> ");
        int choice = sc.nextInt();
        double value;

        if (choice == 1){
            System.out.print("Enter Kg: ");
            value = sc.nextDouble();
            System.out.printf("Gram(g) Value is: %.3fg\n",value*1000);
        }
        else if(choice == 2){
            System.out.print("Enter g: ");
            value = sc.nextDouble();
            System.out.printf("Kilogram(Kg) Value is: %.3fkg\n",value/1000);
        }
        else{
            System.out.println("Exiting Wrong Input!");
        }
        sc.close();
    }
    
}