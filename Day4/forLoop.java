package Day4;

public class forLoop {
    public static void main(String[] args) throws InterruptedException{
        // for loop = execute some code a CERTAIN amount of times;
        //  for (initialisation; condtion; updation) {
        //  } 

        // throws InterruptedException & Thread.sleep(1000ms) --- advanced topics
        // Just use for time delay
        for (int i = 10; i>0;i--) {     // i-- = 
            Thread.sleep(1000);
            System.out.println(i);
        }
        System.out.println("Hello World");


    }
}
