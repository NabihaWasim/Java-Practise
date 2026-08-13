//to reverse an array.
public class reverse {
    public static void main(String[] args) {
        int size=10;
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.print("Array is :");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
        System.out.print("Reversed array is:");
        int temp;
        for(int i=0;i<size/2;i++){
            temp =arr[i];
            arr[i]=arr[size-1-i];
            arr[size-1-i]=temp;  
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }   
    }  
}
