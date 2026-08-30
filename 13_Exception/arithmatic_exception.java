import java.util.Scanner;
public class arithmatic_exception {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first number:");
        int first=input.nextInt();
        System.out.print("Enter second number:");
        int second=input.nextInt();
        //try block
        try{
            int res=first/second;
            System.out.printf("Resuklt is %d ",res);
        }
        //catch block
        catch(ArithmeticException exception){
            System.out.println("Invalid values");
        }
    }
}
