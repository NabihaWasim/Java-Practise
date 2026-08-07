import java.util.Scanner;
public class bitwise {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1=value.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2=value.nextInt();   
        int result_and=num1 & num2; //and operator
        int result_or=num1 | num2;   //or operator
        int result_xor=num1 ^ num2;   //xor operator
        int result_nor=num1;     //not operator
        System.out.println("Result of and operator is "+result_and + "\nResult of or operator is "+result_or);
        System.out.println("Result of xor operator is "+result_xor+" \nand result of nor operator is "+ result_nor);
    }   
}
