import java.util.Scanner;
public class arithmaticexception_message {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1=input.nextInt();
        System.out.print("Enter second number:");
        int num2=input.nextInt();
        //try block
        try{
            int res=num1/num2;
            System.out.printf("Resuklt is %d ",res);
        }
        //catch block
        catch(ArithmeticException exception){
            System.out.println(exception.getMessage());
            System.out.println("Invalid values");
        }
    }
    
}
