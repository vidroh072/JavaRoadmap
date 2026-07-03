package Day5;
import java.util.Scanner;
public class quizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declare variable
        String[] questions = {"What is National game of India",
                            "What is Si unit of current",
                            "Which is largest ocean in world",
                            "which state has most literacy rate",
                            "which is correct speeling"};

        String[][] options = {{"cricket","football","hockey","baseball"},
                            {"Ampere","voltage","meter","kilometer"},
                            {"Pacific","indian","Arabian","Atlantics"},
                            {"MP","RJ","Kerela","Goa"},
                            {"color","diference","bridje","airoplane"}};
        int[] Answer = {3,1,1,3,1};
        int correct=0;

        System.out.println("==== Welcome to Quiz Game ====");
        for (int i = 0; i < questions.length; i++) {
            System.out.print("Q"+(i+1)+" ");
            System.out.println(questions[i]);
            for (int j = 0; j < 4; j++) {
                System.out.print(j+1+". ");
                System.out.println(options[i][j]);
            }
            System.out.println("Choose from (1-4) ");
            System.out.print(" -----> ");
            int choice = sc.nextInt();
            if ((choice)==Answer[i]){
                System.out.println("==============");
                System.out.println("Correct Answer");
                System.out.println("==============");
                correct++;
            }
            else{
                System.out.println("==============");
                System.out.println("!!Wrong Answer");
                System.out.println("==============");

            }
        }
    System.out.println("ThankYou for playing");
    System.out.println("Corrct answers "+correct);
    }
}
