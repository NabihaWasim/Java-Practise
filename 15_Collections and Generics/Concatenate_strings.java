/*Write a method concatenate Strings that takes variable
arguments of String type and concatenates them into a single string.*/

import java.util.ArrayList;
import java.util.Collections;

public class Concatenate_strings {
    public static String concatenate(String... str){
        StringBuilder sb=new StringBuilder();
        for(String i:str){
            sb.append(i).append("  ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(concatenate("uyfbgjeury"));
        System.out.println(concatenate("hello"));
        System.out.println(concatenate("saifiii"));
         System.out.println(concatenate("uyfbgjeury"+" fgvej"));
        

    }

    
}
