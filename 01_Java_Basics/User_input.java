import java.util.Scanner;
public class User_input {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name :");
        String name=input.nextLine();
        System.out.print("Enter your age :");
        int age=input.nextInt();
        System.out.println("Your name is-"+name);
        System.out.println("Your age is-"+age);
    }  
}
