//for each loop implementation
import java.util.Scanner;
public class foreach_loop {
    public static void main(String[] args) {
        String[] arr=new String[]{
            "Harry","Ben","Doug","Stew","Allen"
        };
        //for each loop 
        for(String name:arr){
            System.out.print(name+" ");
        }
        System.out.println();
        //for loop
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
