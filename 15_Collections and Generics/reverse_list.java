/*Create a program that reverses the elements of a List 
and prints the reversed list. */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class reverse_list {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner input= new Scanner(System.in);
        System.out.println("enter numbers in list:");
        for(int i=0;i<6;i++){
            int num=input.nextInt();
            list.add(num);
        }
        for(int i=0;i<6;i++){
            System.out.print(list.get(i)+ " ");  
        } 
        System.out.println();
        Collections.reverse(list);
        for(int i=0;i<6;i++){
            System.out.print(list.get(i)+ " ");  
        } 

        
    }
    
}
