/*Define a BankAccount class with private attributes like accountNumber,
 accountHolderName, and balance. Provide public methods to deposit 
 and withdraw money, ensuring that these methods don't allow illegal
 operations like withdrawing more money than the current balance. */
public class bankaccount_class {
    private String account_holder;
    private int account_no;
    private double balance;
    public bankaccount_class(String account_holder,int account_no){
        this.account_holder=account_holder;
        this.account_no=account_no;
    }
    public void deposit(double money){
        if(money<0){
            System.out.println("Invalid !");
        }
        else{
            balance=balance+money;
        }
    }
    public double withdraw_money(double amount){
        if(amount<0 || amount>balance){
            System.out.println("Invalid !");
        }else{
            balance-=amount;
            System.out.println("New balance is :"+balance);
        }
        return balance;
    }
    @Override
    public String toString () {
        return account_holder+" "+balance;
    }
}
