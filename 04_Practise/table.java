//Multiplication table of the given number using for loop.
import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=input.nextInt();
        for(int i=1;i<=10;i++){
            int mul=num*i;
            System.out.println(num+" X "+i+" = "+mul);
        }
    }
    
}
