package Day5;

import java.util.Scanner;

import java.util.Random;

public class slotMachine {
    static double balance = 100;

    public static void main(String[] args) {
        // variable declaration
        boolean isRunning = true;
        int betAmt;

        // initialising scanner object
        Scanner sc = new Scanner(System.in);

        // menu
        while (isRunning) {
            System.out.println("====================");
            System.out.println("Your Balance 💵 : " + balance);
            System.out.println("Enter Amt of bet: ");
            System.out.print("----> ");
            betAmt = sc.nextInt();
            System.out.println("====================");

            if (balance <= 0) {
                System.out.println("❗ Opps your balance is less than 1RS");
                isRunning = false;
            }
            // checking condtion for betAmt
            if (betAmt > balance) {
                System.out.println("Bet Amt Must be less than Balance");
            } else if (betAmt <= 0) {
                System.out.println("Bet Amt must be Greater than Zero");
            } else {
                System.out.println("Spinning...");
                String[] symbols = selectSymbols();
                System.out.println("--------------------");
                System.out.println(" |" + String.join(" | ", symbols));
                System.out.println("--------------------");
                checkPrice(symbols, betAmt);
            }
        }
        sc.close();
    }

    static String[] selectSymbols() {
        String[] randomSymbols = new String[3];
        String[] symbols = { "🍒", "🍉", "🎃", "⭐", "🤩" };
        Random random = new Random();
        for (int i = 0; i < randomSymbols.length; i++) {
            randomSymbols[i] = symbols[random.nextInt(5)];
        }
        return randomSymbols;
    }

    static void checkPrice(String[] symbols, int betAmt) {
        if (symbols[0].equals(symbols[1]) && symbols[1].equals(symbols[2])) {
            switch (symbols[0]) {
                case "🍒" -> betAmt *= 3;
                case "🍉" -> betAmt *= 5;
                case "🎃" -> betAmt *= 7;
                case "⭐" -> betAmt *= 10;
                case "🤩" -> betAmt *= 20;
            }
            if (symbols[0].equals("🤩")) {
                System.out.println("🤑 Highest Jackpot !!!!!!!!!");
                System.out.printf("Your Won jackpot %d: \n", betAmt);
            }else{
            System.out.printf("Your Won large Amt %d: \n", betAmt);
            balance += betAmt;
            }
        } else if ((symbols[0].equals(symbols[1]) && !symbols[1].equals(symbols[2]))
            || (symbols[1].equals(symbols[2]) && !symbols[0].equals(symbols[1]))
            || (symbols[0].equals(symbols[2]) && !symbols[1].equals(symbols[2]))) {
            switch (symbols[0]) {
                case "🍒" -> betAmt *= 1;
                case "🍉" -> betAmt *= 1;
                case "🎃" -> betAmt *= 2;
                case "⭐" -> betAmt *= 2;
                case "🤩" -> betAmt *= 3;
            }
            System.out.printf("Your Won small Amt 💵 %d: \n", betAmt);
            balance += betAmt;
        } else {
            balance -= betAmt;
            System.out.println("☹️  Sorry for Your Luck !!!\n");
        }
    }
}
