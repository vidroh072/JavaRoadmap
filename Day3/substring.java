package Day3;
import java.util.Scanner;
public class substring{
    public static void main(String[] args) {
        // .substring() = A method used to extract a portion of a string 
        //                .substring(start, end)

        String email;
        String domain;
        String userName;
        // email = "abcdefg@gmail.com"
        // userName = email.substring(0,7);
        // domain = email.substring(8);

        // making it more perfect

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Username: ");
        email = sc.next();
        int begIndex = email.indexOf('@');   // index of @
        userName = email.substring(0,begIndex);
        domain = email.substring(begIndex+1);
        
        System.out.printf("Your Email Address is: %s\n",email);
        System.out.printf("Username: %s\n",userName);
        System.out.printf("Domain: %s\n",domain);

    
    }
}