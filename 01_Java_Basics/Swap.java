import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number - ");
        int a=input.nextInt();
        System.out.print("Enter second number - ");
        int b=input.nextInt();
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping numbers are - "+ a +" and -" +b);
    } 
}
