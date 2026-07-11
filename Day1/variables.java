package Day1;

public class variables {
    public static void main(String[] args) {
        // variable are containers 

        // primitive = simple value store directly
        // Refrence  = memory address(stack) that points to the (heap)

        // types primitive    vs   Refrence
        // int                     String
        // double                  array
        // char                    object
        // boolean

        // steps to create variable
        // 1 declaration
        int num;
        double marks;
        
        // 2 assignment
        num = 5;
        marks = 50.2;
        char ch = 'A';
        boolean check = true;

        String name = "Aakash";

        System.out.println(num);
        System.out.println("your marks is "+marks);
        System.out.println("Are you sure "+check);
        System.out.println("The givem character is "+ch);
        System.out.println("Your name is "+name);
    }
}
