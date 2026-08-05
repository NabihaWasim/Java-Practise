import java.util.Scanner;
public class number_sign {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number:");
        int num=input.nextInt();
        if(num==0){
            System.out.println("Number is zero.");
        }
        else if(num>0){
            System.out.println("Number is positive.");
        }
        else if(num<0){
            System.out.println("Number is negative.");
        }
    }
    
}
