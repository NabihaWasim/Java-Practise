import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("If else loops.");
         //when true if loop executes and if false else loop executes
        boolean ismale=false; 
        System.out.print("Enter name:");
        String name=input.nextLine();
        if(ismale){
            System.out.println("Mr "+name);
        }
        else{
            System.err.println("Ms "+name);
        } 
    }  
}
