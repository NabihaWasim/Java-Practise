//to check if array is palindrome or not using function and while loop.
import java.util.Scanner;
class palindrome_function {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to plaindrome array checker.");
        System.out.print("Enter the number of elements in array:");
        int num=input.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            System.out.print("Enter the element "+i+":");  
            arr[i]=input.nextInt();
        }
        boolean result=palindrome(arr);
        if(result==true){
            System.out.println("Array is palindrome");
        }
        else{
            System.out.println("Array is not palindrome");
        }
    }
    public static boolean palindrome(int[] arr){
        int i=0;
        while(i<arr.length/2){
            if(arr[i]!=arr[arr.length-1-i]){
                return false;
            }
            i++;
        }
        return true;
    }  
}
