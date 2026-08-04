import java.util.Scanner;
public class Arithmatic {
    public static void main(String[] args) {
        System.out.print("Enter your fisrt number:");
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        System.out.print("Enter second number:");
        int num2=input.nextInt();
        System.out.println("Sum is - "+(num1+num2));
        System.out.println("Difference is - "+ (num1-num2));
        System.out.println("Multiplication is - "+ (num1*num2));
        System.out.println("Division is - "+(num1/num2));
        System.out.println("Remainder is- "+(num1%num2));

        
    }
    
}
