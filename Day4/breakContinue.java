package Day4;

public class breakContinue {
    public static void main(String[] args) {
        // break = break out of loop (Stop)
        // continue = skip current iteration of loop (Skip)

        int num = 5;
        for(int i = 1; i<=10; i++){
            if(i==5) continue;
            if(i==8) break;
            System.out.println(num+" X "+i+" = "+num*i);

        }
    }
}
