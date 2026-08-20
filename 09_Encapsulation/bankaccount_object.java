public class bankaccount_object {
    public static void main(String[] args) {
        bankaccount_class customer1=new bankaccount_class("Judy alle",756786540);
        customer1.deposit(5679);
        System.out.println(customer1);
        customer1.deposit(-90);
        System.out.println(customer1);
        customer1.withdraw_money(560);
        System.out.println(customer1);
        customer1.withdraw_money(6000);
    }  
}
