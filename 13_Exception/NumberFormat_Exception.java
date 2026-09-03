import java.util.Scanner;
public class NumberFormat_Exception {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter string:");
        String name=input.nextLine();
        try{
            int x=Integer.parseInt(name);
            System.out.println(x+10);
        }
        catch(NumberFormatException e){
            System.out.println("Cannot convert it."+e.getMessage());
        }
    }
}
