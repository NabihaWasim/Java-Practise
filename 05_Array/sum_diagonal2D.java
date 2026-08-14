//to find sum of diagonal elements.
import java.util.Scanner;
public class sum_diagonal2D {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to 2D array" );
        System.out.print("Enter the number of rows:");
        int row=input.nextInt();
        System.out.print("Enter the number of columns:");
        int column=input.nextInt();
        int[][] arr=new int[row][column];
        System.out.println("Enter the number value of arrays.");
        //input elements of array
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=input.nextInt();
            }  
        }
        System.out.println();
        //display elemets of array
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(i==j){
                    sum=sum+arr[i][j];
                }
            }
        }
        //to print sum of diagonal elements
        System.out.print("Sum is "+sum);
    }
    
}
