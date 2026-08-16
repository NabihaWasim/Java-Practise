//using switch case operator in place of if-else.
import java.util.Scanner;
public class switch_operator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of day from 1-7:");
        int day=input.nextInt();
        switch(day){
            
            case 1:
                System.out.println("Day is Monday.");
                break;
            case 2:
                System.out.println("Day is tuesday.");  
                break;
            case 3:
                System.out.println("Day is Wednesday.");
                break;
            case 4:
                System.out.println("Day is Thursday.");
                break;
            case 5:
                System.out.println("Day is Friday.");  
                break;
            case 6:
                System.out.println("Day is Satruday.");
                break;
            case 7:
                System.out.println("SUNDAY ");
                break;
            default:
                System.out.println("INVALID NUMBER");
        }
    }  
}
