//to find number of occurrences of an element in an array.
import java.util.Scanner;
public class term_repeat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        int num=input.nextInt();
        int[] arr=new int[num];
        System.out.print("Enter elements:");
        for(int i=0;i<num;i++){
            arr[i]=input.nextInt();
        }
        System.out.print("Array is:");
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" " );
        } 
        System.out.println("\n");
        System.out.print("Enter the number from the whose frequency you want:");
        int frequency=input.nextInt();
        int count=0;
        for(int i=0;i<num;i++){
            if(arr[i]==frequency){
                count++;
            }
        }
        System.out.println("Frequency is "+count+" of the element"+frequency);   
    } 
}
