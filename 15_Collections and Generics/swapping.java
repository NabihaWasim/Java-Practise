/* Write a method that swaps two elements in an 
ArrayList, given their indices. */
import java.util.ArrayList;
import java.util.Collections; 
import java.util.Scanner;
public class swapping {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner input= new Scanner(System.in);
        System.out.println("enter numbers in list:");
        for(int i=0;i<4;i++){
            int num=input.nextInt();
            list.add(num);
        }
        for(int i=0;i<4;i++){
            System.out.print(list.get(i)+ " ");  
        } 
        System.out.println("After swapping");
        swap(list,2,3);
        for(int i=0;i<4;i++){
            System.out.print(list.get(i)+ " ");  
        } 
    }
    public static void swap(ArrayList<Integer> list, int x,int y){
        int temp=list.get(x);
        list.set(x,list.get(y));
        list.set(y,temp);
    }
}
