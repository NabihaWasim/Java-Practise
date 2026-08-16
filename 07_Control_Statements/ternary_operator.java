//use of ternary operator in place of if-else statements.
import java.util.Scanner;
public class ternary_operator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1=input.nextInt();
        System.out.print("Enter the second number:");
        int num2=input.nextInt();
        //if-else statement
        int greater_num;
        if(num1>num2){
            greater_num=num1; 
        }else{
            greater_num=num2;
        }
        System.out.println("1.Greater number is "+greater_num);
        //ternary operator statement
        int greater_number=num1>num2 ? num1 : num2;
        System.out.println("2.Greater number is "+greater_number);
    }

    
}
