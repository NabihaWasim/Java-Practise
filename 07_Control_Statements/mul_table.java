//using for loop multiplication table for a number.
import java.util.Scanner;
public class mul_table {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number for the table:");
        int num=input.nextInt();
        for(int i=0;i<=10;i++){
            System.err.println(num+" x "+i+" = "+num*i);
        }
        
    }
    
}
