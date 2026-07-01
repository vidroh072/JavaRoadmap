package Day4;
import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Number: ");
        n = sc.nextInt();
        sc.nextLine();
        System.out.println();

        //  while loop -- use for menus 
        while (n>0){
            System.out.print(n+" ");
            n--;
        }
        System.out.println();

        //  do while loop --- do always work , while the condition false
        //  first do than check condition;
        String name="";
        do{
            System.out.print("Enter your Name: ");
            name = sc.nextLine();
        }while(name.isEmpty());

        System.out.printf("Hello %s",name);
        sc.close();
    }
}
