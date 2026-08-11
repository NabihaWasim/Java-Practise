// To find the sum and average of all elements in an array.
import java.util.Scanner;
public class sum_avg{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of term in array:");
        int term=input.nextInt();
        System.out.print("Enter the elements in array:");
        int[] arr=new int[term];
        for(int i=0;i<term;i++){
            arr[i]=input.nextInt();
        }
        int sum=0;
        for(int i=0;i<term;i++){
            sum=sum+arr[i];
        }
        double average=0;
        average=sum/term;
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
    }
}