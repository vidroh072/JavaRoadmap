import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name ");
        String name = sc.nextLine();
        System.out.println("Your Name is " + name);
        // sc.close();

        // problem 
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        sc.nextLine();  // to fix the problem add after every nextInt
        System.out.print("Enter your grade: ");
        String grade = sc.nextLine();
        System.out.println("your Number is "+" "+num+" "+"grade is "+grade);
        sc.close();

        // moreinputs
    }
}
