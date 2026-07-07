package OOPsPillar.Encapsulation;

class Account{
    private double balance;
    String name;
    Account(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    void getBalance(){
        System.out.printf("balance: %.2f\n",this.balance);
    }
}

// Encapsulation = is the process of hididng data providing controlled 
//                  access   through methods

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Mukesh", 1000);
        // THIS CANNOT ACCESSABLE BCZ IT IS PRIVATE     
        // System.out.println(account.balance);     

        account.getBalance();
        // but you can access this bcz it is allowed this is getter method
    }   
}
