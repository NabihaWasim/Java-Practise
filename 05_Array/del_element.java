//to return a new array deleting a specific element.
import java.util.Scanner;
public class del_element {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr={3,6,3,7,5,7,12,90};
        int[] brr=new int[7];
        System.out.println("array is ");
        for(int i=0;i<8;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        System.out.println("Enter the element you wanna delete");
        int num=input.nextInt();
        int j=0;
        for(int i=0;i<8;i++){
            if(num!=arr[i]){
                brr[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<7;i++){
            System.out.print(brr[i]+" ");
        } 
    }    
}
