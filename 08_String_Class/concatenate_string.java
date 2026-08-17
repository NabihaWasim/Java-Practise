//Concatenate and Convert: Take two strings, 
// concatenate them, ánd convert the result to uppercase.
import java.util.Scanner;
public class concatenate_string {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your string:");
        String str=input.nextLine();
        System.out.print("Enter another string to merge in str:");
        String str1=input.nextLine();
        String new_str=str.concat(" ").concat(str1);
        System.out.println(new_str);
    }
    
}
