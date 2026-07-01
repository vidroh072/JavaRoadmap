package Day2;
import java.util.Scanner;

public class shopingProgram {
    public static void main(String[] args) {
        
        String item;
        int qty;
        float price;
        Scanner sc = new Scanner(System.in);
        System.out.println(" === Shoping Cart === ");
        System.out.print("What You want to buy: ");
        item = sc.next();
        System.out.print("Price Of the Item: ");
        price = sc.nextFloat();
        System.out.print("How many Qty is of: ");
        qty = sc.nextInt();
        System.out.println();
        System.out.println("Your order of "+ item +" Total Qty "+qty+" Total price is "+price);

        sc.close();

    }
}
