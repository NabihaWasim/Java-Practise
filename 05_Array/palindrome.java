//to check is the array is palindrome or not.
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr={1,2,3,2,1};
        System.out.println("Array is : ");
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        boolean check=true;
        //to check if palindrome
        for(int i=0;i<5/2;i++){
            if(arr[i]!=arr[4-i]){
                check=false;
            }
            
        }
        if(check==false){
            System.out.println("Array is not  palindrome.");
        } 
        else{
            System.out.println("Array is  palindrome");
        }       
    }
    
}
