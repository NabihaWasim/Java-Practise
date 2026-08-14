//to merge two sorted arrays in one sorted array
import java.util.Scanner;
public class merge_array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("merging two sorted arrays.");
        System.out.print("Enter number of elemets in array1:");
        int size1=input.nextInt();
        int[] arr1=new int[size1];
        System.out.println("Elements of array 1:");
        for(int i=0;i<size1;i++){
            arr1[i]=input.nextInt();
        }
        System.out.print("Enter number of elemets in array2:");
        int size2=input.nextInt();
        int[] arr2=new int[size2];
        System.out.println("Elements of array 2:");
        for(int i=0;i<size2;i++){
            arr2[i]=input.nextInt();
        }
        int size3=size1+size2,k=0;
        int[] newarr=new int[size3];
        int i=0,j=0;
        while(i<size1 && j<size2){
            if(arr1[i]<arr2[j]){
                newarr[k]=arr1[i];
                k++;
                i++;
            }
            else{
                newarr[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<size1){
            newarr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<size2){
            newarr[k]=arr2[j];
            j++;
            k++;
        }
        for(int n=0;n<size3;n++){
            System.out.print(newarr[n]+" ");
        }      
    }   
}
