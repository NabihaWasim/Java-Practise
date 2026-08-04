import java.util.Scanner;
public class if_else_ladder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("---If-else ladder---");
        System.out.print("Enter age:");
        int age=input.nextInt();
        if(age>18){
            System.out.println("Eligible for license");
        }
        else{
            if(age<3){
                System.out.println("School yet to begin"); //if command inside else loop
            }
            else{
                System.out.println("Eligible for school.");
            }
        }
    }
    
}
