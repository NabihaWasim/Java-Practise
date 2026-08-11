//to check if given number if prime or not
import java.util.Scanner;
public class isprime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number to check if it is prime:");
        int num=input.nextInt();
        boolean isprime=false;
        for(int i=2;i<num;i++){
            if(num%i==0 && num<=1){
                isprime=false;
            }
            else{
                isprime=true; 
            }
        }
        if(isprime!=true){
            System.out.println("Number is not prime.");
        }
        else{
            System.out.println("Number is prime.");
        }    
    } 
}
