package Day2;
import java.util.Scanner;
public class math {
    public static void main(String[] args) {
        
        System.out.println(Math.PI);  // PI value
        System.out.println(Math.E);  // exponent value

        double result;
        result = Math.pow(2,3);  // 2 the power 3  always double
        result = Math.abs(-5);
        result = Math.sqrt(625);    // double
        result = Math.round(3.14);
        result = Math.ceil(3.14);  // 4.0
        result = Math.floor(3.14);  // 3.0
        result = Math.max(10, 20);
        result = Math.min(10,20);
        
        // Use of Math Module to calculate volume and area of circle
        
        Scanner sc = new Scanner(System.in);
        double rad,volume,area;
        System.out.print("Enter Radius of Circle: ");
        rad = sc.nextDouble();

        area = Math.PI*Math.pow(rad,2);
        volume = (4*Math.PI*Math.pow(rad,3))/3;

        System.out.println("Area : "+area);
        System.out.println("Volume : "+volume);
        sc.close();
    }
}
