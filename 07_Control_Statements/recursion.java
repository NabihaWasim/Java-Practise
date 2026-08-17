//recursion:function call
import java.util.Scanner;
public class recursion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Factorail of number.");
        System.out.print("Enter the number whos factorial you want:");
        int num1=input.nextInt();
        //without usng recursion
        int result=1;
        for(int i=1;i<=num1;i++){ 
            result=result*i;
        }
        System.out.println(result);
        //using recursion
        System.out.println();
        System.out.print("Enter the nu mber for recurion:");
        int num2=input.nextInt();
        int result2=factorial(num2);
        System.out.println(result2);
    }  
    public static int factorial(int num){
        if(num==1){
            return 1;
        }
        if(num==0){
            return 1;
        }
        //function calling itself
        return num*factorial(num-1);
    }
}
