
public class Account{
    double deposit(double amount){
        amount = amount*1.05; // apply 5% interest rate to amount
        return amount;
    }
    void getMessage(){
        System.out.println("Thank you for banking with us!");
    }
    public static void main(String[] args){
        Account myAccount = new Account();
        double newBalance = myAccount.deposit(500); // method call
        System.out.println(" Your new balance in 4 months is "+ newBalance);
        myAccount.getMessage(); // method call

    }
}
