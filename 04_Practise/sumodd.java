//Sum of odd numbers
import java.util.Scanner;
public class sumodd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number till wich you want:");
        int num=input.nextInt();
        sum_odd_num(num);
    }
    public static int sum_odd_num(int x){
        int sum=0;
        for(int i=1;i<=x;i=i+2){
            sum=sum+i;
        }
        System.out.println("Sum of odd numbers is "+sum);
        return sum;
    }
}
 