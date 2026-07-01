package Day2;
public class printf{
    public static void main(String[] args) {
        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

        String name = "Vikas";
        char first = 'V';
        int age = 30;
        double height = 60.5;
        boolean isEmployee = true;

        // %[specific-character]
        System.out.printf("Hello %s\n",name);
        System.out.printf("your Name starts with %c\n",first);
        System.out.printf("You are %d Years old\n",age);
        System.out.printf("Your height is %f\n",height);
        System.out.printf("Employee %b\n",isEmployee);

        System.out.printf("Hello %s You are %d old\n",name,age);

        // %[.precision][specifier-character]
        double price1 = 30000.45550;
        double price2 = -15.879550;
        System.out.printf("Price 1 %.1fRs\n",price1);
        System.out.printf("Price 2 %.1fRs\n",price2);

        //  [flags]
        //  + = output a plus            ----> show sign before positive numbers
        //  , = comma grouping seprator  ----> seprate like 10,000
        //  ( = negative numbers are enclosed in ()
        //  space = display a minus if negative, space if positive 
        System.out.println();
        System.out.printf("Output + will be %+.1f\n",price1);
        System.out.printf("comma seprator %,.1f\n",price1);
        System.out.printf("negative enclosed be %(.1f\n",price2);
        System.out.printf("Space be % .1f\n",price2);

        //  [width]
        //  0 = zero padding
        //  number = right justified padding
        //  negative number = left justified padding

        int num1 = 1;
        int num2 = 23;
        int num3 = 456;
        int num4 = 7890;
        System.out.printf("%04d\n",num1);  // 0 to 4 padding like 0001
        System.out.printf("%04d\n",num2);   
        System.out.printf("%-4d\n",num3);   // like 456 space
        System.out.printf("%4d\n",num4);
    }
}