//to find sum and average of 2D array.
import java.util.Scanner;
public class sum_average2D {
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
        //to find sum of all the elemnts of array
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                sum=sum+arr[i][j];
            }
        }
        double average;
        average=sum/(row*column);
        System.out.println("Sum is "+sum+" and  average is "+average);


    }   
}
