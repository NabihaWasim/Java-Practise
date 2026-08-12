//to find the maximum and minimum element in an array.
import java.util.Scanner;
public class max_min {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr={2,8,6,10,3,1};
        System.out.println("Array is:");
        for(int i=0;i<6;i++){
            System.out.print(arr[i]+ " ");
        }
        int max=-1234;
        int min=1234;
        for(int i=0;i<6;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min =arr[i];
            }
        }
        System.out.println("\n");
        System.out.println("Maximum value element in array is "+max);
        System.out.println("Minimum vale element is "+min);
    }
}
