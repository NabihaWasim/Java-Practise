
import java.util.Scanner;
public class factorial{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=input.nextInt();
        factorial(num);
    }
    public static int factorial (int x){
        if(x==1 || x==0){
            System.out.println("Factotial is 1");
        }
        int fact=1;
        for(int i=1;i<=x;i++){
            fact=fact*i;
        }
        System.out.println("Fcatorial is "+fact);
        return fact;
    }    
         
}


           
