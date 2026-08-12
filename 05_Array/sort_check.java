//to check if the given array is sorted.
public class sort_check {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,9,6,7};
        System.out.println("Array is ");
        for(int i=0;i<7;i++){
            System.out.print(arr[i]+" ");
        }
        boolean flag=true;
        System.out.println("");
        for(int i=0;i<7;i++){
            for(int j=i+1;j<7;j++){
                if(arr[i]>arr[j]){
                flag=false;
                break;
              }
            }   
        }
        if(flag==true){
            System.out.println("Array is  sorted");
        } 
        else{
            System.out.println("Array is not sorted");
        }
        

    }   
}
