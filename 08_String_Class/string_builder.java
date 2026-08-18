//Take an array of words and concatenate 
//them into a single string using StringBuilder.
import java.util.Scanner;
public class string_builder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter message :");
        String str1=input.nextLine();
        StringBuilder sb=new StringBuilder(str1);
        System.out.print("Enter message to concate ine str1 :");
        String str2=input.nextLine();
        sb.append(" "+str2);
        System.out.println("New message:"+sb);
    }   
}
